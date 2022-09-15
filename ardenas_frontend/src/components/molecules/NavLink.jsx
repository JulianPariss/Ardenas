import React from "react";
import P from "../atoms/P";
import { useNavigate, useLocation } from "react-router-dom";

const NavLink = (props) => {
    const {path} = props;
    const navigate = useNavigate();
    const location = useLocation();

    function handleClick(){
        navigate(path);
    }

    return(
        path == location.pathname ? <div className="NavLink current" onClick={()=>{handleClick()}}>
                        <P>{props.children}</P>
                    </div>
                    :
                    <div className="NavLink" onClick={()=>{handleClick()}}>
                        <P>{props.children}</P>
                    </div>
    )
}

export default NavLink;