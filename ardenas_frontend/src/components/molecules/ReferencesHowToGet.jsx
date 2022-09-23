import React from "react";
import refereceImage from "../../resources/images/reference_image.png"
import P from "../atoms/P"

const ReferencesHowToGet = () => {
    return(
        <div className="ReferenceHowToGet">
            <P>La entrada al campo es por una ruta paralela, es decir la tranquera no se encuentra frente a la ruta 11.</P>
            <img src={refereceImage} alt={"Mapa de referencia"}/>
        </div>
        
    )
}

export default ReferencesHowToGet;