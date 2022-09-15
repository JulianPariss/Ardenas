import React from "react";
import Icon from "../atoms/Icon";
import H1 from "../atoms/H1";
import Logo from "../../resources/icons/ardenas_logo.png"
import "../../styles/styleLeftHeaderBlock/LeftHeaderBlock.css"

const LeftHeaderBlock = () =>{
    return(
        <div className="LeftHeaderBlock">
            <Icon url={Logo} alt={"Ardenas Logo"}/>
            <H1>Airsoft Club La Plata</H1>
        </div>
    )
}

export default LeftHeaderBlock;