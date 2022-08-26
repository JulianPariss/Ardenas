import React from "react";


const Icon = (props) => {
    const {icon, alter} = props;
    return(
        <image className="icon" src={icon} alt={alter}/>
    )
}

export default Icon;