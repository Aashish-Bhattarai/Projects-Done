import React from 'react';
import './Pic.css';

export default function Pic() {
    // Define image URLs
    let image1 = process.env.PUBLIC_URL + '/original.jpg';
    let image2 = process.env.PUBLIC_URL + '/work culture.png';
    let image3 = process.env.PUBLIC_URL + '/1542298796.jpg';
    let image4 = process.env.PUBLIC_URL + '/earth.png';
    let image5 = process.env.PUBLIC_URL + '/nature.jpg';

    return (
        <>
            {/* First container with text and image */}
            <div className='1st-container'>
                <label className='pic1-text'>Building the Future </label>
                <img className= 'imgOne' src={image1} alt="Original.jpg" />
            </div>
            
            {/* Second container with text, including styled 'Ought' */}
            <div className='2nd-container'>
                <label className= 'pic2-text'> Features <br/> <span className='orange-text'>Ought</span> to <br/> Partake </label>
                <img className='imgTwo' src={image2} alt="work culture.png"/>
            </div>

            {/* Third container with two images */}
            <div className='3rd-container'>
                <img className='imgThree' src={image3} alt="1542298796.jpg"/>
                <img className='imgFour' src={image4} alt="earth.png"/>
            </div>

            {/* Container with a large image, translucent text, and a button */}
            <div className="img-container">
                <img className="imgFive" src={image5} alt="nature.jpg" />
                <div className="translucent">
                    <label className="pic5-text1">Every inspiration from nature</label>
                    <label className="pic5-text2">
                        Get started using our services with a 30-day free trial
                    </label>
                    <button className="try-button">Try it Now</button>
                </div>
            </div>
        </>
    );
}
