<div align="center">
  <h1>Test Automation Project for Demoblaze Website</h1>
</div>

![DemoBlazeWebsite](https://github.com/user-attachments/assets/4aedf6f2-7ede-45e9-9ad1-762681171fc4)

## Overview
This project automates testing processes on the Demoblaze website using Selenium WebDriver, TestNG, and Java. The aim is to validate the functionality of various user workflows such as user login, product selection, adding products to the cart, and completing a purchase.

* Automated end-to-end tests for user registration, login, and product purchase
* Data-driven testing with TestNG
* Page Object Model (POM) for maintaining a clean and scalable codebase
* Reports generated using TestNG and integrated into the project

## Technologies Used
<a href="https://selenium.dev" rel="nofollow"><img src="https://camo.githubusercontent.com/c14bdde117aab22a44a4a4f23e66844c855076e8beaf2e32f568ff53dce2450f/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" width="40" height="40" alt="Selenium" data-canonical-src="https://selenium.dev/images/selenium_logo_square_green.png" style="max-width: 100%;"></a>
<a href="https://testng.org/" rel="nofollow"><img src="https://private-user-images.githubusercontent.com/122634626/306417621-86a31183-1950-4cf4-bbbe-c1c1d6dc2567.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjcyODE5MjYsIm5iZiI6MTcyNzI4MTYyNiwicGF0aCI6Ii8xMjI2MzQ2MjYvMzA2NDE3NjIxLTg2YTMxMTgzLTE5NTAtNGNmNC1iYmJlLWMxYzFkNmRjMjU2Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTI1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkyNVQxNjI3MDZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kZDE5ZTZkMDg5ZTQzOTMwZDQ2NTJiODRjMDg5NWJiOWJkZjViNzkxNTk0NTM4MmE1Mzg0OTk5ZDE3NjMzYzU1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.TbYnuVIIzbA6caayO8oLq19S5sSfivt_33oAcdVufpc" width="40" height="40" alt="TestNG" secured-asset-link="" style="max-width: 100%;"></a>
<a href="https://allurereport.org/" rel="nofollow"><img src="https://private-user-images.githubusercontent.com/122634626/313275999-510d998c-4ccd-479c-816d-6110aee38201.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjcyODE5MjYsIm5iZiI6MTcyNzI4MTYyNiwicGF0aCI6Ii8xMjI2MzQ2MjYvMzEzMjc1OTk5LTUxMGQ5OThjLTRjY2QtNDc5Yy04MTZkLTYxMTBhZWUzODIwMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTI1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkyNVQxNjI3MDZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mZjQyZTFjMGVjY2UyNjIyMzA4NTYxODdhNjc0ODJkNjljZDRlOGFjM2ZhYTE4YmU2MjIxNmE4YWY5NDQ3NmY4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.9kALXaGnBvqEX6joSwPJjL-eYHUnQnjDzdjoyC5PBXA" width="40" height="40" alt="allurereport" secured-asset-link="" style="max-width: 100%;"></a>
- Selenium WebDriver  
- Java
- TestNG
- Maven (for managing dependencies)
- Extent Reports (for generating test reports)

 ## Prerequisites
Before diving into the project, ensure you have the following prerequisites:

- Java (Version 8 or higher).
- Maven for project management.
- An IDE like Eclipse or IntelliJ.
- Selenium WebDriver (Java bindings).
- TestNG(for organizing test cases, managing test execution, and generating reports).
- Optionally, Allure Reports for enhanced reporting.

 ## Installation Instructions
   1. Clone the repository:
      git clone https://github.com/DinaMagdyS/DemoBlazeSelenium.git
  2. Navigate to the project directory.
  3. Install the required dependencies (Selenium WebDriver, TestNG) using Maven.

## Project Structure
The project structure is organized implementing POM as follows:

 - src/main/java: Contains classes and methods for every page.
 - src/test/java: Contains test automation scripts for every page on the website.

## Example Test Scenarios
Some of the automated test cases implemented are :
- Validate user can register and login
- Verify product can be added to the cart
- Ensure purchase flow works correctly
- Assert that cart total is accurate

 ## Contributing 
 Contributions and collaboration are more than welcome and very much encouraged to make this project a valuable resource for the testing community.

 ## Contact
 For any queries or assistance, feel free to contact me via email at dinamagdyelmorsy@outlook.com
 
  
