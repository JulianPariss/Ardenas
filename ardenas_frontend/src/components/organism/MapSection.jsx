import React from "react";
import H2 from "../atoms/H2";
import LocationInfo from "../molecules/LocationInfo";



const MapSection = () => {
    return(
        <div className="MapSection">
            <LocationInfo/>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d104625.07636374122!2d-57.815502721996474!3d-34.968295861231596!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x95a2f56e92cf4df1%3A0xa4df34395615a8be!2sArdenas%20Airsoft!5e0!3m2!1ses-419!2sar!4v1663262685685!5m2!1ses-419!2sar" className="Map" allowFullScreen="" loading="lazy" referrerPolicy="no-referrer-when-downgrade"></iframe>
        </div>
    )

} 

export default MapSection;