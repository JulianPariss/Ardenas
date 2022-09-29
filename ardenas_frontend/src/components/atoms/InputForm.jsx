import React from "react";


const InputForm = (props) => {
    const { register, extra } = props;
    return(
        <input className="InputForm" {...register} {...extra}/>
    )
}

export default InputForm;