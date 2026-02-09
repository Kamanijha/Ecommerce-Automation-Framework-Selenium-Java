# Demo Web Shop Automation Framework – Documentation

## 1. Introduction

This document provides complete technical documentation for the **Demo Web Shop End-to-End Automation Framework**. The framework is designed using **Java, Selenium WebDriver, TestNG**, and follows the **Page Object Model (POM)** with **Data Driven Testing** using Excel.

The automation covers the full customer journey from **user registration** to **order placement and logout**, ensuring application stability and business flow validation.

---

## 2. Application Under Test (AUT)

* **Application Name:** Demo Web Shop
* **Domain:** E-commerce

---

## 3. Objectives of Automation

* Automate complete end-to-end e-commerce flow
* Reduce manual testing effort
* Validate critical business workflows
* Support data-driven testing
* Improve test reliability and reusability

---

## 4. Technology Stack

| Tool / Technology  | Purpose                     |
| ------------------ | --------------------------- |
| Java               | Programming Language        |
| Selenium WebDriver | UI Automation               |
| TestNG             | Test Execution & Assertions |
| Apache POI         | Excel Data Handling         |
| Maven              | Dependency Management       |
| Page Object Model  | Framework Design Pattern    |

---

## 5. Framework Design

### 5.1 Design Pattern

* **Page Object Model (POM)**
* Each web page has a separate Java class
* Improves code readability and maintainability

### 5.2 Framework Type

* Hybrid Framework

  * POM
  * Data Driven Testing

---

## 6. Project Structure

```
DemoWebShopAutomation
│
├── src/test/java
│   ├── demoWebShopEndToEnd
│   │   └── DemoWebShopEndToEnd.java
│   │
│   ├── page_Object_repo
│   │   ├── Page_object.java
│   │   └── Register.java
│   │
│   ├── genricUtility
│   │   └── FileUtility.java
│   │
│   └── base_utility
│       └── BaseClass.java
│
├── src/test/resources
│   └── DDTesting.xlsx
│
└── README.md
```

---

## 7. Utilities Explanation

### 7.1 FileUtility

* Reads test data from Excel file
* Methods Used:

  * `getRowCount()`
  * `getCellData()`

### 7.2 BaseClass

* Browser setup and teardown
* Common reusable configurations

---

## 8. Test Data Management

### Excel File: `DDTesting.xlsx`

#### Sheet 1: user

| Column | Description |
| ------ | ----------- |
| 0      | First Name  |
| 1      | Last Name   |

#### Sheet 2: Address

| Column | Description  |
| ------ | ------------ |
| 0      | Country      |
| 1      | City         |
| 2      | Address      |
| 3      | Zip Code     |
| 4      | Phone Number |

---

## 9. Automated Test Scenario

### 9.1 User Registration

* Navigate to application
* Read user data from Excel
* Generate unique email using timestamp
* Complete registration

### 9.2 Product Selection

* Navigate to Books section
* Sort products by price (High to Low)
* Change display count
* Add multiple products to cart

### 9.3 Cart & Checkout

* Accept terms and conditions
* Proceed to checkout
* Enter billing address from Excel

### 9.4 Shipping & Payment

* Select Pickup in Store
* Choose Cash on Delivery payment method

### 9.5 Order Confirmation

* Confirm order
* Navigate to order history
* View order details
* Logout

---

## 10. Synchronization Strategy

* Implicit Wait for global timeout
* Explicit Wait for dynamic elements
* Avoided Thread.sleep where possible

---

## 11. How to Execute Tests

### Step 1: Clone Repository

```
git clone <repository-url>
```

### Step 2: Import Project

* Import as Maven/Java project in Eclipse or IntelliJ

### Step 3: Run Test

* Execute `DemoWebShopEndToEnd.java` as TestNG Test

---

## 12. Test Reporting

* TestNG default reports are generated
* Can be extended with Extent Reports

---

## 13. Error Handling

* Dynamic waits to handle synchronization issues
* Unique email generation avoids duplicate user errors

---

## 14. Future Enhancements

* Extent Reports integration
* Cross-browser testing
* Jenkins CI/CD pipeline
* Parallel execution
* Screenshot on failure

---

## 15. Conclusion

This automation framework ensures reliable end-to-end testing of the Demo Web Shop application. It follows industry best practices and can be easily extended for enterprise-level testing needs.

---

## 16. Author

**Kamani Jha**
Automation Testing | Java | Selenium | TestNG
