# Vacation-booking-backend (Spring Boot)
This project is a Java Spring Boot REST API for a vacation bookings web application, built as part of a competency-based software engineering course (WGU). The backend connects to an existing MySQL database and works with a provided Angular frontend (unmodified). This application demonstrates object-oriented design, use of Spring Data JPA, implementation of design patterns, and integration with relational databases.

## Project Overview

The backend was developed to replace a legacy system for a travel agency, providing secure management of bookings, customers, and vacation packages. It is integrated with a provided MySQL schema and a separate Angular front-end. The codebase strictly focuses on the backend and does not modify the supplied Angular client.

## Features

- REST endpoints for booking vacations and customers.
- Persistent integration with a MySQL database.
- Object-oriented design practices.
- Use of JPA, Repositories, Services, and Controllers.
- Implementation of purchase/cart/order data classes and services.
- Input validation to match frontend requirements.
- Five sample customers seeded at startup (not overwritten on restart).
- Cross-Origin support for the Angular frontend.
- Professional commit history, as required.

## Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL
- **Build Tool:** Maven
- **ORM:** Spring Data JPA (Hibernate)
- **Lombok** for boilerplate code reduction
- **Repository Hosting:** GitLab
- **Frontend:** (supplied, unmodified) Angular

## Database Scheema

![Database Schema](https://github.com/joshmarek22/Vacation-booking-backend/blob/616b1fee4d3909148eee6a6a263d99450167ea7c/ERD-Diagram.pdf)
