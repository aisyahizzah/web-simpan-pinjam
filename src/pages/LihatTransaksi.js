import React, { useState, useEffect } from 'react';
import DatePicker from 'react-date-picker';
import axios from 'axios'
import Table from 'react-bootstrap/Table'
import '../styles/LihatTransaksi.css';
import Anggota from '../images/icon-anggota.png';


function LihatTransaksi() {
    const [ anggota ] = useState(["Semua"])
    const [ daftarAnggota, setDaftarAnggota ] = useState([]);
    const [value, onChange] = useState(new Date());
    const [ daftarTransaksi, setDaftarTransaksi ] = useState([])

    useEffect(() => {
        axios.get(`http://localhost:8080/simpanPinjam/mutation/all`)
            .then(res => {
               setDaftarTransaksi(res.data);
            }).catch((err) => {
                console.log(err)
            })
        
        axios.get(`http://localhost:8080/simpanPinjam/member/name`)
            .then(res => {
               setDaftarAnggota(res.data);
            }).catch((err) => {
                console.log(err)
            })
    }, []);

    return(
        <div className="App-lihat-transaksi">
            <div className="Lihat-transaksi-header">
                <div className="Lihat-transaksi-header-title">Transaksi Kelompok</div>
            </div>
            <div className = "Lihat-transaksi-filter">
                <div className = "Lihat-transaksi-dropdown">
                    <button className = "Lihat-transaksi-input-anggota">
                        <img className = "option-icon" src = {Anggota} alt="icon"/>
                        &nbsp;&nbsp;&nbsp;{ anggota }
                    </button>
                    <div className = "Lihat-transaksi-dropdown-content">
                        <div class = "anggota-option">Semua</div>
                        { daftarAnggota.map((anggota) => (
                            <div class = "anggota-option">{ anggota }</div>
                        ))}
                    </div>
                </div>
                <div className="Lihat-transaksi-tanggal">
                    <div className="Lihat-transaksi-tanggal-title">Dari tanggal : </div>
                    <DatePicker customStyles={{dateInput:{borderWidth: 0}}} className="Lihat-transaksi-date-picker"
                        onChange={onChange}
                        value={value}
                    />
                    <div className="padding"></div>
                    <div className="Lihat-transaksi-tanggal-title">Sampai tanggal : </div>
                    <DatePicker className="Lihat-transaksi-date-picker"
                        onChange={onChange}
                        value={value}
                    />
                </div>
            </div>
            <div className="Lihat-transaksi-body">
                <Table striped bordered>
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Tanggal</th>
                            <th>Jenis Transaksi</th>
                            <th>Jumlah</th>
                            <th>Nama Anggota</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            daftarTransaksi.map((transaksi, index) => (
                                <tr>
                                    <td>{ index }</td>
                                    <td>{ transaksi.mutationDate }</td>
                                    <td>{ transaksi.mutationTransactionType }</td>
                                    <td>{ transaksi.mutationNominal }</td>
                                    <td>{ transaksi.mutationMemberName }</td>
                                </tr>
                            ))
                        }
                    </tbody>
                </Table>
            </div>
        </div>
    );
}

export default LihatTransaksi;