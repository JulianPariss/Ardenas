import React from "react";
import H2 from "../atoms/H2";
import Icon from "../atoms/Icon";
import gps_logo from "../../resources/icons/location_gps.svg"


const LocationInfo = () => {
    return(
        <div className="LocationInfo">
            <Icon url={gps_logo} alt="Localizacion"/>
            <H2>A solo 30 minutos en auto desde el centro de La Plata por la ruta provincial número 11.</H2>
        </div>
    )
}

export default LocationInfo;