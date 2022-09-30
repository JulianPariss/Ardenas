import React from "react";
import SectionCards from "../organism/SectionCards";
import homeCards from "../../resources/data/homeCards.json"

const Home = () => {
    return(
        <div className="Home">
            <SectionCards data={homeCards}/>
        </div>
    )
}

export default Home;