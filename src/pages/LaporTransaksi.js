import Laporan from '../images/icon-laporan.png';
import '../styles/LaporTransaksi.css';
import React, { useState, useEffect } from 'react';
import DatePicker from 'react-date-picker';
import axios from 'axios';


function LaporTransaksi() {
    const [ daftarAnggota, setDaftarAnggota ] = useState([]);
    const [ jenisTransaksi ] = useState(["Simpan", "Pinjam"]);
    const [ date, setDate ] = useState(new Date());
    const [ name, setName ] = useState("");
    const [ type, setType ] = useState("Simpan");
    const [ nominal, setNominal ] = useState(0);

    useEffect(() => {
        axios.get(`http://localhost:8080/simpanPinjam/member/name`)
            .then(res => {
               setDaftarAnggota(res.data);
               setName(res.data[0]);
            }).catch((err) => {
                console.log(err)
            })
    }, []);

    const handleSubmit = (event) => {

        let current_datetime = date

        var year = current_datetime.getFullYear();
        var month = current_datetime.getMonth() + 1;
        var day = current_datetime.getDate();

        if (month < 10) {
            month = '0' + month;
        }
        if (day < 10) {
            day = '0' + day;
        }

        let formatted_date = year + "-" + month + "-" + day
        
        let formatted_nominal = parseInt(nominal);
        
        const data = {"mutationDate" : formatted_date, "mutationMemberName" : name, "mutationTransactionType" : type, "mutationNominal" : formatted_nominal}

        console.log(JSON.stringify(data))

        axios.post(`http://localhost:8080/simpanPinjam/mutation/create`, JSON.stringify(data), {
            headers: {
                'Content-Type': 'application/json'
            }})
            .then(res => {
                alert("Submit success!");
            })
            .catch((err) => {
                alert("Failed to submit!");
                console.log(err)
            })

    }

    return(
        <div className="App-lapor-transaksi">
            <div className="Lapor-transaksi-header">
                <img className="Lapor-transaksi-header-icon" src={Laporan}/>
                <div className="Lapor-transaksi-header-title">Pelaporan Transaksi</div>
            </div>
            <div className="Lapor-transaksi-body">
                <div className="Lapor-transaksi-body-title">Isi form berikut ini</div>
                <div className="Lapor-transaksi-body-form">
                    <form onSubmit = {handleSubmit}>
                        <div id = "Lapor-transaksi-form-container">

                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Nama anggota</div>
                                <select className = "Lapor-transaksi-input-field" name="mutationMemberName" id="mutationMemberName" onChange={() => setName(document.getElementById("mutationMemberName").value)}>
                                { daftarAnggota.map((anggota) => (
                                    <option>{ anggota }</option>
                                ))}
                                </select>
                            </div>
                            
                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Tanggal</div>
                                <DatePicker className = "Lapor-transaksi-input-field" onChange={setDate} value={date} name="mutationDate" id="mutationDate"/>
                            </div>

                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Jenis transaksi</div>
                                <select className = "Lapor-transaksi-input-field" name="mutationTransactionType" id="mutationTransactionType" onChange={() => setType(document.getElementById("mutationTransactionType").value)}>
                                    {
                                        jenisTransaksi.map((jenis) =>
                                        (
                                            <option value={jenis}>{ jenis }</option>
                                        ))
                                    }
                                </select>
                            </div>

                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Jumlah transaksi</div>
                                <input className = "Lapor-transaksi-input-field" 
                                    type = "number" 
                                    name = "mutationNominal"
                                    id = "mutationNominal"
                                    onChange = {(e) => setNominal(e.target.value)}
                                    placeholder = "Jumlah (Rp)"
                                required/>
                            </div>

                            <input 
                                type = "submit" 
                                value = "Submit"
                                className = "Lapor-transaksi-form-submit"/>

                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default LaporTransaksi;