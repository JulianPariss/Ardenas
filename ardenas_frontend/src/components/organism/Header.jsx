import React from "react";
import LeftHeaderBlock from "../molecules/LeftHeaderBlock";
import "../../styles/styleHeader/Header.css"
import RightHeaderBlock from "../molecules/RightHeaderBlock";
const Header = () => {
    return(
        <header className="Header" >
            <LeftHeaderBlock/>
            <RightHeaderBlock/>
        </header>
    )
}

export default Header;