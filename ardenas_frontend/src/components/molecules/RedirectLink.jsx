import React from "react";
import P from "../atoms/P";
import Button from "../atoms/Button";
import { useNavigate } from "react-router-dom";


const RedirectLink = (props) => {
    const navigate = useNavigate();
    const {toPath, link} = props;
    return(
        <P>{props.children}<Button handleClick={()=>{navigate(toPath)}}>{link}</Button></P>
    )
}

export default RedirectLink;