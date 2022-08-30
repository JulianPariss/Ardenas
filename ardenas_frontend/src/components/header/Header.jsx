import React, {useContext, useEffect} from "react";
import {userContext} from "../userContext";
import Icon from "../molecules/icons/Icon";
import logo from "../../resources/icons/logo.png"
import "../../css/header.css"

const Header = () => {
    const { isLogged } = useContext(userContext)

    
    return(
        
            <header>
                <div className="leftBlock">
                    <h1 className="slogan">Airsoft club La Plata</h1>
                    <Icon icon={logo} alter={"Logo"}/>
                </div>  
                {isLogged && <p>Hay contexto!</p>}
            </header>
        
    )
}

export default Header;