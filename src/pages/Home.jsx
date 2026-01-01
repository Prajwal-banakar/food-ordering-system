import React from "react";
import Helmet from "../components/Helmet/Helmet.js";
import { Container, Row, Col } from "reactstrap";

import { Link } from "react-router-dom";

import heroImg from "../assets/images/hero.png";
import "../styles/hero-section.css";

const Home = () => {
  return (
    <Helmet title="Home">
      <section className="hero__section">
        <Container>
          <Row>
            <Col lg="6" md="6">
              <div className="hero__content">
                <h5 className="hero__subtitle">Easy way to make an order</h5>
                <h1 className="hero__title">
                  <span>HUNGRY?</span> Just wait <br />
                  food at<span> your door</span>
                </h1>

                <p className="hero__desc">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Qui
                  magni delectus tenetur autem, sint veritatis!
                </p>

                <div className="hero__btns">
                  <button className="order__btn">
                    <Link to="/pizzas">
                      Order Now <i className="ri-arrow-right-s-line"></i>
                    </Link>
                  </button>

                  <button className="all__foods-btn">
                    <Link to="/pizzas">See all foods</Link>
                  </button>
                </div>

                <div className="hero__service">
                  <div className="hero__service-item">
                    <span>
                      <i className="ri-car-line"></i>
                    </span>
                    <p>No shipping charge</p>
                  </div>

                  <div className="hero__service-item">
                    <span>
                      <i className="ri-shield-check-line"></i>
                    </span>
                    <p>100% secure checkout</p>
                  </div>
                </div>
              </div>
            </Col>

            <Col lg="6" md="6">
              <div className="hero__img">
                <img src={heroImg} alt="hero-img" className="w-100" />
              </div>
            </Col>
          </Row>
        </Container>
      </section>
    </Helmet>
  );
};

export default Home;
