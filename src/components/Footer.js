import React from "react";
import '../styles/Footer.css';
import { Container, Row, Col, Image } from 'react-bootstrap';
import logo from '../images/logo.png';

function Footer() {
    return(
        <Container fluid>
            <Row className="App-footer">
                <Col sm={1}>
                    <Image src={logo} className="Footer-logo" alt="Logo"/>
                </Col>
                <Col sm={8} className="Footer-identitas">
                    <div className="Footer-nama">PT. SIMPAN-PINJAM INDONESIA</div>
                    <p className="Footer-slogan">Mendorong perkembangan ekonomi anggota dan masyarakat <br/> yang lebih maju dan transparan.</p>
                </Col>
                <Col sm={3} className="Footer-kontak">
                    <div className="Footer-section-title">
                        CONTACT 
                    </div>
                    <div className="Footer-section-item">
                        Jalan Dummy No.123 Bandung, Jawa Barat, Indonesia 
                    </div> 
                    <div className="Footer-section-item">
                        hi@simpanpinjam.com
                    </div> 
                    <div className="Footer-section-item">
                        (+62) 81234567890
                    </div> 
                </Col>
            </Row>
            <Row>

            </Row>
        </Container>
    );
}

export default Footer;