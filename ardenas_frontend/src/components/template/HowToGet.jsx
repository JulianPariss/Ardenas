import React from "react"; 
import H2 from "../atoms/H2";
import MapSection from "../organism/MapSection";
import "../../styles/styleHowToGet/HowToGet.css"

const HowToGet = () => {
    return(
        <div className="HowToGet">
            <H2>¿Como llego?</H2>
            <MapSection/>
        </div>
    )
}

export default HowToGet;