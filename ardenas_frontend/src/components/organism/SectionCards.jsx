import React from "react";
import cardsJson from "../../resources/data/sectionCards.json"
import SectionCard from "../molecules/SectionCard";

const SectionCards = () => {
    return(
        cardsJson.map((elem)=>{
            return( <SectionCard title={elem.title} content={elem.content} key={elem.id}/> )
        })
    )
}

export default SectionCards;