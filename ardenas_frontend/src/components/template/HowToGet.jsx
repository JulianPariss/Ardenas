import React from "react"; 
import H2 from "../atoms/H2";
import MapSection from "../organism/MapSection";
import "../../styles/styleHowToGet/HowToGet.css"
import SectionSeparator from "../molecules/SectionSeparator";
import ReferencesHowToGet from "../molecules/ReferencesHowToGet";

const HowToGet = () => {
    return(
        <div className="HowToGet">
            <H2>¿Como llego?</H2>
            <MapSection/>
            <SectionSeparator>Referencias</SectionSeparator>
            <ReferencesHowToGet/>
        </div>
    )
}

export default HowToGet;