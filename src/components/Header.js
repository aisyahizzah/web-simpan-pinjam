import '../styles/Header.css';
import React from "react";
import logo from '../images/logo-simpan-pinjam.png';
import { Container, Navbar, Nav } from 'react-bootstrap';
import { globalHistory } from "@reach/router";

function Header() {
    return(
        <Container fluid>
            <Navbar className = "App-header" expand="md" fixed = "top">
                <Navbar.Brand>
                    <Nav.Link href ="/">
                        <img className = "App-logo" src = {logo} alt = "Logo"/>
                    </Nav.Link>
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
                <Navbar.Collapse id="responsive-navbar-nav" className="justify-content-end">
                    <Nav>
                        <Nav.Link className = "link-container" href="/anggota">
                            Anggota
                            <span style = {{display : globalHistory.location.pathname !== "/anggota" ? "none" : "inline-block"}}
                                className = "active-nav" />
                        </Nav.Link>
                                
                        <Nav.Link className = "link-container" href="/transaksi" >
                            Transaksi
                            <span style = {{display : globalHistory.location.pathname !== "/transaksi" ? "none" : "inline-block"}}
                                className = "active-nav"/>
                        </Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
        </Container>
    );
}

export default Header;