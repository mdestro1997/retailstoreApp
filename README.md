# retailstoreApp


# Project Title #

# Retails Store Discounts App #

This application provide a service developed using Spring Boot to get or provide discount for given Clients( provide client's user type or catergory and amount payable).The following discounts apply:

If the user is an employee of the store, he gets a 30% discount. <br /> 
If the user is an affiliate of the store, he gets a 10% discount. <br />
If the user has been a customer for over 2 years, he gets a 5% discount. <br />
For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). <br />
The percentage based discounts do not apply on groceries. <br />
A user can get only one of the percentage based discounts on a bill. <br />
<br />

# UML Diagram #
https://lucid.app/lucidchart/invitations/accept/inv_4e14f852-3cdc-4978-bc54-dec67950615b?viewport_loc=-316%2C-1%2C2514%2C1261%2CHWEp-vi-RSFO


# Requirements # <br />
For building and running the application you need: <br />

JDK 11(JAVA) <br />
Maven <br />
If using VS Code kindly install Java and SpringBoot Extensions.

# API Documentation #

This API can be documented using Swagger a tool that is used for generating, visualizing, and maintaining API docs. Swagger takes the hard work out of generating and maintaining API docs, ensuring your documentation stays up-to-date as the API evolves.

# Running the application locally #

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method of the applicatiion from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run. 

# API Testing # <br />
API testing can be carried out using postman and postman runner functionality. Pass userType and amount as params on postman.

<img width="819" alt="Screenshot 2021-06-29 at 12 07 16" src="https://user-images.githubusercontent.com/44907126/123779533-8de10c00-d8d2-11eb-8d92-e6f7fcc9d3dd.png">


