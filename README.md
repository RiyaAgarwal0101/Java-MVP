# Java-MVP

---

## Table of Contents

- [System Requirements](#system-requirements)
- [Installation](#installation)
- [Setup Instructions](#setup-instructions)
- [Running the Application](#running-the-application)
- [Output](#output)

---

## System Requirements

Before starting the setup, make sure you have the following tools installed:

- **Java Development Kit (JDK)**:
  - Install [JDK 17+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
  - Verify installation by running:
    ```bash
    java -version
    ```

- **Maven** (for building and managing dependencies):
  - Install Maven from [here](https://maven.apache.org/download.cgi).
  - Verify by running:
    ```bash
    mvn -version
    ```

- **Git** (for cloning the repository):
  - Install Git from [here](https://git-scm.com/).
  - Verify by running:
    ```bash
    git --version
    ```

- **IDE** (I am using Eclipse):
  - Use an IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/) for easier development.

---

## Installation

To install and set up the project on your local machine, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/RiyaAgarwal0101/Java-MVP.git
   cd your-spring-project

2. **Build the project using Maven**:

     ```bash
    mvn clean install
---



## Setup Instructions
1. **Configure application properties**:
    
The application properties are in the src/main/resources/application.properties

You can setup a different database connection to database of your choice. 


## Running the Application
Once you have completed the setup, you can run the project using Maven:

1. **Run the Spring Boot application**:

    In the root directory of the project, run the following command to start the application:
  ```bash
  mvn spring-boot:run
```
2. **Access the application**:
Go to Postman
 
 **Make POST request**:
 - http://localhost:8080/api/training-centers
 - Provide data by going on: body -> raw ->JSON
 - In header make 
 ``` bash 
 key: Content-Type  
 value: application/json
 ```

 **Make GET request**:
 - http://localhost:8080/api/training-centers
 - You will get the data given in post request

---

## Output
![alt text](https://github.com/RiyaAgarwal0101/Java-MVP/blob/main/POST.jpg"POST request")
![alt text](https://github.com/RiyaAgarwal0101/Java-MVP/blob/main/GET.jpg"GET request")
![alt text](https://github.com/RiyaAgarwal0101/Java-MVP/blob/main/MongoDB.jpg"Checking MongoDB")
