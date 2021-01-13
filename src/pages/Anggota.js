import React, { useState } from 'react';

import '../styles/Anggota.css';

import Picture from "../images/anggota.png";
import Ttl from "../images/icon-ttl.png";
import Alamat from "../images/icon-alamat.png";

function Anggota() {
    
    const [ daftarAnggota ] = useState([
        {nama : "Aisyah", ttl : "15 Juni 2020", alamat : "Jl Peta No 96 Bandung 40234" },
        {nama : "Aisyah", ttl : "15 Juni 2020", alamat : "Jl Peta" },
        {nama : "Aisyah", ttl : "15 Juni 2020", alamat : "Jl Peta" }
    ]);

    return(
        <div className="App-anggota">
            <div className="Anggota-header">
                <div className="Anggota-header-tag">Anggota Kami</div>
                <div className="Anggota-header-title">Yuk, kenalan dengan anggota kelompok!</div>
                <div className="Anggota-header-subtitle">Kami adalah tim kecil, yang bertujuan untuk tujuan besar: meningkatkan ekonomi masyarakat.</div>
            </div>
            <div className="Anggota-body">
            {
                daftarAnggota.map((anggota) => (
                    <div className="Anggota-item">
                        <img src={Picture} className="Anggota-photo" alt="Anggota"/>
                        <div className="Anggota-info">
                            <div className="Anggota-nama">{ anggota.nama }</div>
                            <div className="Anggota-detail">
                                <img src={Ttl} className="Anggota-icon" alt="Icon"/>
                                <div>{ anggota.ttl }</div>
                            </div>
                            <div className="Anggota-detail">
                                <img src={Alamat} className="Anggota-icon" alt="Icon"/>
                                <div>{ anggota.alamat }</div>
                            </div>
                        </div>
                    </div>
                ))
            }
            </div>
        </div>
    );
}

export default Anggota;