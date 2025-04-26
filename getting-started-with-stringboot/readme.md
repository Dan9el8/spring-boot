## Getting started with Spring boot
# Objectives
After going through this unit one should be able to understand the concept of springboot, you can set up your development enviroment and learn the 12-factor app that an application should have.

# System requirements
Spring boot
Java 8 and higher
The Spring framework will automatically be downloaded if you include spring-boot-starter-parent with version the spring team changed the naming convention of their release version after releasing the 2.3.9REALEASE version.

# Setting up the environment
Install java development kit:
https://www.oracle.com/in/java/technologies/javase/javase-jdk8-
downloads.html

Click on the checkbox as mentiioned in the following screenshot

![alt text](image.png)

Install Apache Maven
https://maven.apache.org/download.cgi

Install gradle
https://gradle.org/releases

After installation you need to add Enviroment user variables which will have a path value to the root folder of the software

To check if included, in the CMD run java -version, gradle -version, maven -version

Install Spring tool suite
Browse the following link on chrome to download STS for windows
Any Integrated Development Enviroment(IDE) can be used to develop a spring boot application, however it is suggested to have spring tool suite or Intellij for developing Spring Boot applications

# The 12-factor app
Any developer who builds the application that runs as a service, should incorporate the 12-factor in their application, as follows:

One codebase is tracked in revision control; many deploys
Explicitly declare and isolate dependencies.
Store config in the environment.
Backing Treat backing services as attached resources.
Build, release, Strictly separate build and run stages.
Execute the app as one or more stateless processes.
Port Export services via port binding.
Scale out via the process model.
Maximize robustness with fast startup and graceful shutdown.
Dev/prod Keep developing, staging, and production as similar as
possible.
Treat logs as event streams.
Admin Run admin/management tasks as one-off processes.

# Spring Initializr
One of te best ways to create a spring boot application is to generate the skeleton project from Spring B
Browse the following link:
 https://start.spring.io/

 ![alt text](image-1.png)

 After clicking on the GENERATE button, it will download a .zip file containing the skeleton of the code

 Another way of creating a new spring boot project in STS could be by going to File -> New -> project, or if there are no STS built projects in the workspace then click on Create a project... in the project explorer and select Spring Starter project as shown in the following screenshot:

 ![alt text](image-2.png)