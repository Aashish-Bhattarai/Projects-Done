import React from 'react'
import './Nav.css';

export default function Nav() {
  return (
    <nav className="navbar">
    <div className="nav-container">
      <a href="/" className="nav-link">Home</a>
      <a href="/" className="nav-link">Features</a>
      <a href="/" className="nav-link">Download</a>
      <a href="/" className="nav-link">Carrer</a>
      <a href="/" className="nav-link">Pricing</a>
    </div>
  </nav>
  )
}

