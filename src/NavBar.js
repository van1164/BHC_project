import React from 'react';
import styled from 'styled-components';

const NavBar = () => {
    return (
        <div className='NavBar'>
            <TopMenu>
                    <div>뿌</div>
            </TopMenu>
        </div>
    )
}

export default NavBar;

const TopMenu = styled.div`
    height: 100vh;
    display: flex;
    background-color: #E9AC06;
    margin-right: 1em;
    align-items: center;
    justify-content: space-between;
`

