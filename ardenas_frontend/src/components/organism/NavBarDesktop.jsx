import React from "react";
import NavLink from "../molecules/NavLink";
import "../../styles/styleNavBarDesktop/NavBarDesktop.css"

const NavBarDesktop = (props) => {
    return(
        <div className="NavBarDesktop">
            <NavLink path={"/"}>Home</NavLink>
            <NavLink path={"/map"}>Mapa</NavLink>
            <NavLink path={"/how-to-get"}>Como llegar</NavLink>
            <NavLink path={"/games"}>Partidas</NavLink>
            <NavLink path={"/contact"}>Contacto</NavLink>
        </div>
    )
}

export default NavBarDesktop;