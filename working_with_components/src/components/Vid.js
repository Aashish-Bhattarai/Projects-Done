import React from 'react';
import './Vid.css';

// A functional component that displays a YouTube video.
export default function Vid() {
  return (
    <div className="video-container">
      <iframe
        src="https://www.youtube.com/embed/dpEPNioJ1Ik?autoplay=1&mute=1"
        title="YouTube Video"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      ></iframe>
    </div>
  );
}
