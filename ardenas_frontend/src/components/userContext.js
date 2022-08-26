import React, { useState } from "react";

export const userContext = React.createContext();
    


const UserContextProvider = ({children}) =>{
    const [isLogged, setIsLogged] = useState(false);

    return(
        <userContext.Provider
            value={{
                isLogged,
                setIsLogged
            }}
        >   
            {children}
        </userContext.Provider>
    )
}

export default UserContextProvider;