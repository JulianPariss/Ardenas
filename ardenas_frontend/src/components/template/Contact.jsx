import React from "react";
import SectionCards from "../organism/SectionCards";
import H2 from "../atoms/H2";
import contactCards from "../../resources/data/contactCards.json"
import "../../styles/styleContact/Contact.css"


const Contact = () => {
    return(
        <div className="Contact">
            <H2>Contacto</H2>
            <SectionCards data={contactCards}/>
        </div>
    )
}

export default Contact;