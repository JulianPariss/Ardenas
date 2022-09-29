import React from "react";

const P = (props) => {
    const {extraClass} = props;
    return(
        <p className={extraClass ? "P"+extraClass : "P"}>{props.children}</p>
    )
}

export default P;