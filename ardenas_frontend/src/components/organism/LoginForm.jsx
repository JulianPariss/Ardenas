import React from "react";
import { useForm } from "react-hook-form";  
import { yupResolver } from "@hookform/resolvers/yup"
import * as yup from "yup";
import FormField from "../molecules/FormField";

const onSubmit = data => console.log(data);

const schema = yup.object({
    username: yup.string().required("Campo requerido"),
    password: yup.string().required("Campo requerido").min(6, "Requiere al menos 6 caracteres"),
  }).required();

const LoginForm = () => {
    const { register, handleSubmit, formState:{ errors } } = useForm({
        resolver: yupResolver(schema)
      });

    return (
        <div className="LoginForm">
            <form onSubmit={handleSubmit(onSubmit)}>
                <FormField title="Nombre de usuario" register={register("username")} error={errors.username?.message} extra={{placeholder: "Kiva"}}/>
                <FormField title="Contraseña" register={register("password")} error={errors.password?.message} extra={{type: "password", placeholder: "SecretPass"}}/>
                <input type="submit" value="Iniciar sesion" className="SubmitButton"/>
            </form>
        </div>
    )
}

export default LoginForm;