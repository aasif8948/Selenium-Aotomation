# OrangeHRM Selenium Automation Framework

A Java-based automation project for testing the OrangeHRM web application using Selenium WebDriver and TestNG.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI for reading Excel test data
- Allure reporting
- Git and GitHub

## Project Structure

- `src/main/java/base` — WebDriver setup and shared test configuration.
- `src/main/java/pages` — Page classes containing locators and actions.
- `src/main/java/utils` — Utilities for reading Excel data and capturing screenshots.
- `src/test/java` — Automated test classes.
- `src/test/resources` — Test data and resources.
- `pom.xml` — Maven dependencies and build configuration.

## Features

- Login test automation.
- Dashboard validation.
- Page Object Model structure.
- Excel-based test data.
- Screenshot utility.
- Allure reporting support.

## Prerequisites

- A compatible Java JDK.
- Maven.
- Google Chrome.
- IntelliJ IDEA or another Java IDE.

## How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Load the Maven dependencies.
4. Review the application URL and demo test data.
5. Run a TestNG test class from the IDE.

If Maven test execution is configured, run:

    mvn clean test

## Test Data

Use demo credentials only. Do not commit real passwords, access tokens, or personal information.

## Project Purpose

This project demonstrates Selenium automation with Java, reusable page classes, and data-driven testing.
