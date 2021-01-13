import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Layout from './components/Layout';
import Anggota from './pages/Anggota';
import LihatTransaksi from './pages/LihatTransaksi';
import { Switch, Route, BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Layout>
        <BrowserRouter>
          <Switch>
            <Route exact path="/anggota" component={Anggota}/>
            <Route exact path="/lihat-transaksi" component={LihatTransaksi}/>
          </Switch>
        </BrowserRouter>
      </Layout>
    </div>
  );
}

export default App;
