import React from "react";
import Icon from "../atoms/Icon";
import H1 from "../atoms/H1";
import Logo from "../../resources/icons/ardenas_logo.png"
import "../../styles/styleLeftHeaderBlock/LeftHeaderBlock.css"
import Button from "../atoms/Button";
import { useNavigate } from "react-router-dom";
const LeftHeaderBlock = () =>{
    const navigate = useNavigate();
    return(
        <div className="LeftHeaderBlock">
            <Button handleClick={()=>{navigate("/")}}>
                <Icon url={Logo} alt={"Ardenas Logo"}/>
                <H1>Airsoft Club La Plata</H1>
            </Button>
        </div>
    )
}

export default LeftHeaderBlock;