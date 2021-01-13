import '../styles/Home.css';
import Background from "../images/background.jpg";

function Home() {
    return(
        <div className="App-home"> 
            <img className="App-home-image" src={Background} alt="background"/>
            <div className="App-home-title">SIMPAN-PINJAM</div>
            <div className="App-home-subtitle">Memberikan kemudahan demi mendukung kesejahteraan masyarakat.</div>
        </div>
    ); 
}

export default Home;