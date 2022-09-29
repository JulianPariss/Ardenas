import React from "react";

const Button = (props) => {
    const { handleClick } = props;
    return(
        <button className="Button" onClick={ handleClick }>{props.children}</button>
    )
}

export default Button;