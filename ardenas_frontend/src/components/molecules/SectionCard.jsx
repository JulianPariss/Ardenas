import React from "react";
import H2 from "../atoms/H2";
import P from "../atoms/P";
import "../../styles/styleSectionCard/SectionCard.css"

const SectionCard = (props) => {
    const {title, content} = props;
    return(
        <div className="SectionCard">
            <div className="SectionTitle">
                <H2>{title}</H2>
            </div>
            <P>{content}</P>
        </div>
    )
 }

 export default SectionCard;