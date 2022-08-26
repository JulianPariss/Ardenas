import './App.css';
import { Routes, Route } from "react-router-dom" 
import Header from './components/header/Header.jsx';
import Home from './components/Home/Home';
import UserContextProvider from './components/userContext';

function App() {
  return (
    <div className="App">
      <UserContextProvider>
        <Header/>
        <Routes>
          <Route path='/' element={<Home/>}/>
        </Routes>
      </UserContextProvider>
    </div>
  );
}

export default App;
