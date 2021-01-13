import Laporan from '../images/icon-laporan.png';
import '../styles/LaporTransaksi.css';
import React, { useState } from 'react';
import DatePicker from 'react-date-picker';


function LaporTransaksi() {
    const [ daftarAnggota ] = useState(["Aisyah", "Aisyah", "Aisyah"]);
    const [ jenisTransaksi ] = useState(["Simpan", "Pinjam"]);

    return(
        <div className="App-lapor-transaksi">
            <div className="Lapor-transaksi-header">
                <img className="Lapor-transaksi-header-icon" src={Laporan}/>
                <div className="Lapor-transaksi-header-title">Pelaporan Transaksi</div>
            </div>
            <div className="Lapor-transaksi-body">
                <div className="Lapor-transaksi-body-title">Isi form berikut ini</div>
                <div className="Lapor-transaksi-body-form">
                    <form>
                        <div id = "Lapor-transaksi-form-container">

                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Nama anggota</div>
                                <select className = "Lapor-transaksi-input-field" >
                                    {
                                        daftarAnggota.map((anggota) =>
                                        (
                                            <option value={anggota}>{ anggota }</option>
                                        ))
                                    }
                                </select>
                            </div>
                            
                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Tanggal</div>
                                <DatePicker className = "Lapor-transaksi-input-field" />
                            </div>

                            <div className = "Lapor-transaksi-input">
                                <div className = "Lapor-transaksi-input-label">Jenis transaksi</div>
                                <select className = "Lapor-transaksi-input-field" id="input-dropdown">
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
                                    name = "jumlah"
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