import React from "react"
import { BrowserRouter, Routes, Route, NavLink } from "react-router-dom";
import Map from "../pages/Map";
import Home from "../pages/Home";

export default function Router() {
    return(
        <BrowserRouter>

            <Routes>
                <Route exact path='/' element={<Home />} />
                <Route path='/map' element={<Map />} />
            </Routes>
        </BrowserRouter>

    )
}
