import React from "react";
import { useForm } from "react-hook-form";  
import { yupResolver } from "@hookform/resolvers/yup"
import * as yup from "yup";
import "yup-phone";
import FormField from "../molecules/FormField";

const onSubmit = data => console.log(data);

const schema = yup.object({
    username: yup.string().required("Campo requerido"),
    name: yup.string().required("Campo requerido"),
    lastname: yup.string().required("Campo requerido"),
    email: yup.string().required("Campo requerido").email("El formato es incorrecto"),
    phone_number: yup.string().required("Campo requerido").phone("AR",undefined,"Ingrese un numero valido"),
    password: yup.string().required("Campo requerido").min(6, "La contraseña debe contener al menos 6 digitos"),
    confirm_password: yup.string().oneOf([yup.ref("password"), null], "Las contraseñas deben coincidir"),
  }).required();

const RegisterForm = () => {
    const { register, handleSubmit, formState:{ errors } } = useForm({
        resolver: yupResolver(schema)
      });

    return (
        <div className="RegisterForm">
            <form onSubmit={handleSubmit(onSubmit)}>
            <FormField title="Nombre de usuario" register={register("username")} error={errors.username?.message} extra= {{placeholder: "Kiva"}}/>
                <div className="HalfConteiner">
                    <div className="HalfFields">
                        <FormField title="Nombre" register={register("name")} error={errors.name?.message} extra={{placeholder: "Julian"}}/>
                        <FormField title="Correo electronico" register={register("email")} error={errors.email?.message} extra={{placeholder: "Julian@hotmail.com"}}/>
                    </div>
                    <div className="HalfFields">
                    <FormField title="Apellido" register={register("lastname")} error={errors.lastname?.message} extra={{placeholder: "Paris"}}/>
                        <FormField title="Número telefonico" register={register("phone_number")} error={errors.phone_number?.message} extra={{placeholder: "+54 221 6357835"}}/>
                    </div>
                </div>
        
                <FormField title="Contraseña" register={register("password")} error={errors.password?.message} extra={{type: "password", placeholder: "SecretPass"}}/>
                <FormField title="Confirmar contraseña" register={register("confirm_password")} error={errors.confirm_password?.message} extra={{type: "password", placeholder: "SecretPass"}}/>
                <input type="submit" value="Crear cuenta" className="SubmitButton"/>
            </form>
        </div>
    )
}

export default RegisterForm;