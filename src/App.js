import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Layout from './components/Layout';
import Anggota from './pages/Anggota';
import LihatTransaksi from './pages/LihatTransaksi';
import LaporTransaksi from './pages/LaporTransaksi';
import Home from './pages/Home';
import { Switch, Route, BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Layout>
        <BrowserRouter>
          <Switch>
            <Route exact path="/" component={Home}/>
            <Route exact path="/anggota" component={Anggota}/>
            <Route exact path="/lihat-transaksi" component={LihatTransaksi}/>
            <Route exact path="/lapor-transaksi" component={LaporTransaksi}/>
          </Switch>
        </BrowserRouter>
      </Layout>
    </div>
  );
}

export default App;
