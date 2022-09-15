import './App.css';
import Header from './components/organism/Header';
import Home from './components/template/Home';
import { Routes, Route } from "react-router-dom"
import Mapa from './components/template/Mapa';
import NavBarDesktop from './components/organism/NavBarDesktop';

function App() {
  return (
    <div className="App">
      <Header/>
      <NavBarDesktop/>
      <body className='Body'>
        <div className='Background'/>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/map' element={<Mapa/>}/>
          <Route path='/how-to-get' element={<Mapa/>}/>
          <Route path='/games' element={<Mapa/>}/>
          <Route path='/contact' element={<Mapa/>}/>
        </Routes>
      </body>
    </div>
  );
}

export default App;
