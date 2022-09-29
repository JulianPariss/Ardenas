import './App.css';
import Header from './components/organism/Header';
import Home from './components/template/Home';
import { Routes, Route } from "react-router-dom"
import Mapa from './components/template/Mapa';
import NavBarDesktop from './components/organism/NavBarDesktop';
import HowToGet from './components/template/HowToGet';
import Login from './components/template/Login';
import Register from './components/template/Register';

function App() {
  return (
    <div className="App">
      <Header/>
      <NavBarDesktop/>
      <body className='Body'>
        <div className='Background1Layer'/>
        <div className='Background2Layer'/>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/map' element={<Mapa/>}/>
          <Route path='/how-to-get' element={<HowToGet/>}/>
          <Route path='/games' element={<Mapa/>}/>
          <Route path='/contact' element={<Mapa/>}/>
          <Route path='/login' element={<Login/>}/>
          <Route path='/register' element={<Register/>}/>
        </Routes>
      </body>
    </div>
  );
}

export default App;
