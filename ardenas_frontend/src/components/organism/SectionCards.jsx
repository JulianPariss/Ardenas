import React from "react";
import SectionCard from "../molecules/SectionCard";

const SectionCards = (props) => {
    const { data } = props;
    return(
        data.map((elem)=>{
            return( <SectionCard title={elem.title} content={elem.content} key={elem.id}/> )
        })
    )
}

export default SectionCards;