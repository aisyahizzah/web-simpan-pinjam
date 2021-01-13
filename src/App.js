import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Layout from './components/Layout';
import Anggota from './pages/Anggota';
import { Switch, Route, BrowserRouter } from 'react-router-dom';


function App() {
  return (
    <div className="App">
      <Layout>
        <BrowserRouter>
          <Switch>
            <Route exact path="/anggota" component={Anggota}/>
          </Switch>
        </BrowserRouter>
      </Layout>
    </div>
  );
}

export default App;
