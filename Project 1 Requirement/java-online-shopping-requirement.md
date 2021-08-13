# Online Shopping

## Description
   
   The Online Shopping is a console-based menu driven application that simulates online shopping experience. An employee can add Products. A Customer can place order on the products. The employee delivers the Product to the Customer.

## Purpose

   We want to see that you can meet deadlines and that you can code. You are expected to complete the following requirements and give a 5 minute presentation of your project to our QC team.

## Requirements
1. Functionality should reflect the below user stories.
2. Data is stored in a database.
3. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects.
4. Service Layer need to be implemented which depends on Data Access layer for getting data from database.
5. Presentation Layer (console) should depend on Service Layer to implement each feature.
6. All input is received using the java.util.Scanner class.
7. Log4j is implemented to log events to a file.
8. A minimum of 10 JUnit test is written to test some functionality.

## User Stories

|#|User Story
|-----|-----|
|1|As an user, I can login.
|2|As a employee, I can add a new product.
|3|As a customer, I can signup using my email, first name, last name and password.
|4|As a customer, I can view the list of products with price.
|5|As a customer, I can add a product to cart.
|6|As a customer, I can view the cart with product list and total.
|7|As a customer, I can place orders on the items in cart. Each product in the cart becomes an individual order.
|8|As a employee, I can mark the status of an order as shipped.
|9|As a customer, I can mark the order as received.
|10|As a customer, I can view all my orders and it's status.
|11|As a user, I can logout of my session.
|12|As a employee, he can search customer by various filters like email, id, name, orderid etc.

NOTE:
1. User in above context refers to both employee and customer
2. Presume that there is only one Employee in the system. Hardcode an Employee in the system. Employee can login directly.
3. Customer needs to be created/registered fresh and then login. Customers are many.


## Project Evaluation Parameters
1. Your project will be evaluated based on coverage of technology rather than the user stories.
2. How well you present, naming conventions, separation of code into various classes, how well have you applied OOP and design patterns.
3. So you could focus less on user stories and more on coverage of things/technologies which you learnt during the training.
