import React from "react";

const Icon = (props) =>{
    const { url, alt } = props;
    return(
        <img src={url} alt={alt} className="Icon"/>
    )
}

export default Icon;