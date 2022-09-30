import React from "react";
import LoginForm from "../organism/LoginForm";
import "../../styles/styleLogin/LoginRegister.css"
import H2 from "../atoms/H2";
import RedirectLink from "../molecules/RedirectLink";

const Login = () => {
    return(
        <div className="Login">
            <H2>Iniciar sesión</H2>
            <LoginForm/>
            <RedirectLink toPath="/register" link="Creala acá">¿Aún no tenes cuenta? </RedirectLink>
        </div>
    )
}

export default Login;