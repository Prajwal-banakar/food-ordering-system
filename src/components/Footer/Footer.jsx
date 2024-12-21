import React from "react";
import { ListGroup } from "reactstrap";

import logo from "../../assets/images/res-logo.png";
import "../../styles/footer.css";

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer__logo">
        <img src={logo} alt="logo" />
        <h5>Tasty Guru</h5>
        <p>Best Foods in town, try it out!</p>
        <h4> Ramanagara</h4>
      </div>
      <div>
        <h5 className="footer__title mb-3">contact us</h5>
        <ListGroup>
          <div className="delivery__time-item border-0 ps-0">
            <span>monday - saturday</span>
            <p> 7:00am - 11:00pm </p>
          </div>
          <div className="delivery__time-item border-0 ps-0">
            <span> sunday - </span>
            <p>Holiday</p>
          </div>
        </ListGroup>
        <ListGroup>
          <div className="delivery__time-item border-0 ps-0">
            <span> support team  : </span>
            <p> tastyguru@gmail.com </p>
          </div>
          <div className="delivery__time-item border-0 ps-0">
            <span> contact : </span>
            <p>8310484117</p>
          </div>
        </ListGroup>
      </div>
    </footer>
  );
};

export default Footer;
