Employee Portal application using Angular-springboot,java 8, swagger, JPA

This example shows how to use angular application with java 8, Spring boot with help of swagger.

Here you can see following things.

Server Side

SpringBoot,
Maven 3+,
JAVA 8,
Spring MVC architecture,
RestController,
Swagger,
Use of data jpa,
H2 Database,
Unit testing using junit and mockito,
Frontend side

Angular2 Components

Modal,
CRUD Functionality (Create, Read(view/display)),
Single Page Application,
Routing | Router outlet | Router,
Stunning UI with bootstrap

How to Setup this project

Backend

Maven 3+,
Java 8,
Use spring initializer to use spring boot template with dependencies

Frontend

Clone project, Open cmd or Node js Command prompt
npm install -g angular-cli to install angular 2 cli ( globally )
npm install to install Node packages,

How to Run

Backend
mvn clean install to clean if exists files and install packages
mvn spring-boot:run to start spring boot

Frontend
ng serve --open or npm start
Make sure backend service is up and running before start frontend

Guide to Build and Run Project
When you Import this project, You need to fulfill the requirements.
If you have imported project in eclipse, Follow this steps to build project:

Right click on project > Properties > Java Build path
Change your JDK if 1.8 is not set.
You need Maven 3+ configured in your system (or You can download Maven 3+ from here)
Once you setup with all this things, Right click on project > Run as > Maven clean (you can directly do this using mvn clean command in cmd at specific project dir)
Again right click on project, Find Maven > in options, Click on Update project check Update snapshots forcefully option and press ok.
Now you can refresh your project. Run clean and build project.
Main Important step > Right click on project > Run as > Maven Install This step will install required dependency specified in [pom.xml]

H2 is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode.

Very fast, open source, JDBC API
Embedded and server modes; in-memory databases (Simple meaning => data will not persist on the disk)
lightweight Java database
It can be embedded in Java applications or run in the client-server mode Whatever things (Objects, String or anything) you want to store in H2 you can. In this example, whatever values you want to store (CRUD operations), it will be retain in H2 Database till you shutdown your tomcat.(or other servers).

Frontend

Front end includes unit test case in jasmine, with component for employee registration amd for view employee. Routing is also implemented. server.js included for production deployment.
