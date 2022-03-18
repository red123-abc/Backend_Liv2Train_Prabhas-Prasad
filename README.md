# Backend_Liv2Train_Prabhas-Prasad

Problem Statement : To make an MVP (Minimum Viable Product) for a for a registry for Govt funded Training Centers with the following minimum requirements. In the MVP, Spring project has to be created with support for two APIs.

Requirements :

PART 1 :
To create a POST API and following fields have been included in the project :
  1. ID
  2. Centre Name
  3. Address
     3.1 Detailed Address
     3.2 City
     3.3 State
     3.4 Pincode
  4. Student Capacity (Size of training centre)
  5. Contact Email Address
  6. Contact number (Mobile phone)

PART 2 :
To create a GET API to get list of all stored training centres information and the result is to be shown in json format of output.

NOTE :
1. Mandatory Fileds have been included in the project.
2. Validations are made by creating REST conroller.
3. Files under Model package have been created.
4. File under DAO package have been created.
5. File under Controller package have been created.
6. Exception Handling is managed and the files are included in the Exception Handling package.
7. The filters / JPA specifications can be managed by adding @Test code to compare the data in the record with the desired result.

How to Run the Application :
The SpringBootDemoApplication.java file is to be compiled and run at the location -> SpringBootDemoApplication\src\main\java\com\howtodoinjava\rest\SpringBootDemoApplication.java 

The default port that Spring Boot runs in is 8080. If you want to change the port for whatever reason, you can set it up in your application.properties file:

server.port = 9090

If you have an IDE like IntelliJ that has extensive support for running Spring Boot projects, then you may go ahead and run it that way.
If not, we'll be using the command line to run our project. We can run the application directly by executing 
./mvnw spring-boot:run (or ./gradlew bootRun if you're using Gradle) on the command line from your base project folder where pom.xml is located.

Another option is to package your application into a jar file and running it that way.




