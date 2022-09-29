import React from "react";
import H2 from "../atoms/H2";
import RedirectLink from "../molecules/RedirectLink";
import RegisterForm from "../organism/RegisterForm";
import "../../styles/styleLogin/Login.css"

const Register = () => {
    return(
        <div className="Register">
            <H2>Crear cuenta</H2>
            <RegisterForm/>
            <RedirectLink toPath="/login" link="Inicia sesión acá">¿Ya tenes una cuenta? </RedirectLink>
        </div>
    )
}

export default Register;