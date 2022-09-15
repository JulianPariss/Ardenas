import React from "react";
import LeftHeaderBlock from "../molecules/LeftHeaderBlock";
import "../../styles/styleHeader/Header.css"
const Header = () => {
    return(
        <header className="Header" >
            <LeftHeaderBlock/>
        </header>
    )
}

export default Header;