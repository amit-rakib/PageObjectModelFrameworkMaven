# PageObjectModelFrameworkMaven

A Selenium-based automation testing framework using the Page Object Model (POM) design pattern with Maven.  
This project demonstrates a basic end-to-end test case for an e-commerce web application, including login, product selection, cart validation, and order placement.

## 📌 Features

- Page Object Model architecture
- Maven-based build management
- Explicit and implicit waits
- Stream API for dynamic product handling
- Assertions using JUnit
- End-to-end checkout process automation

## 🧪 Test Case Overview

The main test class `SubmitOrderTest` performs the following steps:

1. Launches the Chrome browser.
2. Logs in with a registered user account.
3. Selects a product (`ZARA COAT 3`) from the product list.
4. Adds the product to the cart.
5. Verifies the product in the cart.
6. Proceeds to checkout.
7. Selects "India" as the country.
8. Places the order.
9. Verifies the success message: **"Thankyou for the order."**

## 📁 Project Structure

```bash
PageObjectModelFrameworkMaven/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── amit/
│   │           └── PageObjects/
│   │               └── LandingPage.java
│   └── test/
│       └── java/
│           └── amit/
│               ├── SubmitOrderTest.java
│               └── TestComponents/
│                   └── BaseTest.java
├── test-output/
│   ├── emailable-report.html
│   ├── index.html
│   ├── junitreports/
│   └── Default suite/
├── target/
├── pom.xml
└── README.md

```
## ⚙️ Setup Instructions

### Clone the repository

```bash
git clone https://github.com/amit-rakib/PageObjectModelFrameworkMaven.git
cd PageObjectModelFrameworkMaven
```

### Install dependencies
Make sure you have Maven and Java 17+ installed.

```bash
mvn clean install
```

Run the test
You can run the test using your IDE or via command line:

``` bash
mvn exec:java -Dexec.mainClass="amit.SubmitOrderTest" -Dexec.classpathScope=test

```
## 🔧 Prerequisites

- Google Chrome browser installed
- ChromeDriver in your system PATH
- Java 17 or above
- Maven

## ✍️ Author

Md. Amit Hasan Rakib

Email: mdamithasanrakib11@gmail.com

