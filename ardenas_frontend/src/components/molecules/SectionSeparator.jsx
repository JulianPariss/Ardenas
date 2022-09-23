import React from "react";  
import HrLine from "../atoms/HrLine";
import H2 from "../atoms/H2";
import "../../styles/styleSeparator/SectionSeparator.css"

const SectionSeparator = (props) => {
    return(
        <div className="SectionSeparator">
            <H2>{props.children}</H2>
            <HrLine/>
        </div>
    )
}

export default SectionSeparator;