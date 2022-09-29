import React from "react";
import InputForm from "../atoms/InputForm";
import P from "../atoms/P";



const FormField = (props) => {
    const { title, register, error, extra} = props;
    return(
        <div className="FormField">
            <P>{title}</P>
            <InputForm register={register} extra={extra}/>
            {error ? <P extraClass={" error"}>{error}</P> : <div className="P-div"></div> }
        </div>
    )
}

export default FormField;