# RestAPI-SpringBoot

## Overview

This project implements REST API built using Spring Boot and JPA (Java Persistence API) that interacts with a MariaDB / MySQL database. The API provides CRUD (Create, Read, Update, Delete) operations to manage cloud vendor details like vendor ID, name, address, and phone number.

## Features

- **GET**: Retrieve details of a specific or all cloud vendors.
- **POST**: Add a new cloud vendor.
- **PUT**: Update existing cloud vendor details.
- **DELETE**: Delete a cloud vendor by ID.
- Exception handling for vendor not found.

## Prerequisites

Before running this project, ensure you have the following installed:

- Java 17
- Apache Maven
- MariaDB / MySQL (running on port 3307 or modify it in `application.yaml`)
- Spring Boot (version 3.3.4)

## Database Setup

This project uses a MariaDB database. Create a database named `cloud_vendor` and configure the database credentials in `application.yaml`.

```sql
CREATE DATABASE cloud_vendor;
```

## Run the Application

To run the Spring Boot application, execute the following command:

```
mvn spring-boot:run
```
The API will be available on http://localhost:8088.

---

## Endpoints

1. Get Cloud Vendor by ID
   - Method: GET
   - URL: ```/cloudvendor/{vendorId}```
   - Example : ```curl -X GET http://localhost:8088/cloudvendor/C1```

2. Get All Cloud Vendors
   - Method: GET
   - URL: ```/cloudvendor```
   - Example : ```curl -X GET http://localhost:8088/cloudvendor```

3. Create a New Cloud Vendor
   - Method: POST
   - URL: ```/cloudvendor```
   - Example : ```curl -X POST http://localhost:8088/cloudvendor \                                   
       -H 'Content-Type: application/json' \                                                   
       -d '{"vendorId": "C1", "vendorName": "Vendor 1", "vendorAddress": "Address One", "vendorPhoneNumber": "1231231231"}'```

4. Update Cloud Vendor
   - Method: PUT
   - URL: ```/cloudvendor```
   - Example : ```curl -X PUT http://localhost:8088/cloudvendor \                                   
       -H 'Content-Type: application/json' \                                                       
       -d '{"vendorId": "C1", "vendorName": "Updated Vendor", "vendorAddress": "Updated Address", "vendorPhoneNumber": "9876543210"}'```

5. Delete Cloud Vendor
   - Method: GET
   - URL: ```/cloudvendor/{vendorId}```
   - Example : ```curl -X DELETE http://localhost:8088/cloudvendor/C1```
  
## Exception Handling

The project includes custom exception handling. If a cloud vendor is not found, the API will return a 404 Not Found status with a descriptive message.

