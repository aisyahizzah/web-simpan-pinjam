import React from 'react'
import { Container } from 'react-bootstrap';

import Header from '../components/Header'
import Footer from '../components/Footer'

const Layout = (props) => {
    return(
        <Container fluid>
            <Header />
            {props.children}
            <Footer />
        </Container>
    )
}

export default Layout;