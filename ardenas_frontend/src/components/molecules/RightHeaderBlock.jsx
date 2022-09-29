import React from "react";
import Button from "../atoms/Button";
import { useNavigate, useLocation } from "react-router-dom";


const RightHeaderBlock  = () => {
    const location = useLocation();
    const navigate = useNavigate();

    return(
        <div className="RightHeaderBlock">
            {location.pathname != "/login" && <Button handleClick={()=>{navigate("/login")}}>Iniciar sesion</Button>}
            {location.pathname != "/register" && <Button handleClick={()=>{navigate("/register")}}>Registrarse</Button>}
        </div>
    )
}

export default RightHeaderBlock;