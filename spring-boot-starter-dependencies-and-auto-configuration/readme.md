## Spring boot starter dependencies and auto-configuration
In this chapter you are going to understand different spring boot starter dependencies available which are used commonly for developing an application and how those dependencies can be configured by just writting the configurations.

# Objectives
Spring boor starters
Spring boot starter dependencies and their configurations
Understanding auto-configuration

# Spring boot starters
Spring boot provides a number of starter packs which can be used while developing an application
These starter packs when loaded into classpath get into action
These starter packs resolvr problem of hunting different code snippets for configuring your application related to the utility or technology

# Starter pack
Spring boot-starter - Is the core component of the sping boot framework, it is used fot the core support which also includes auto-configuration support, logging events and YAML. It includes the following dependancies:
![alt text](image.png)

spring-boot-starter-parent - It is the parent pom providing dependancies and plugin management for application built with Maven build tool
spring-boot-starter-web - Is well constructed to build web application, including RESTful services, applications using Spring MVC.
spring-boot-starter-data-jpa - Has the capability to interact with the database using spring data Java Persistance APIwith Hibernate
spring-boot-starter-test - Is used when we want to have some unit testing to be executed
spring-boot-starter-security - Takes care of the access to the application by incluing spring security in the classpath

spring-boot-starter-actuator - gives out the production-ready features to help you monitor and manage your application by using spring boot actuator.
 spring-boot-starter-logging - is the default starter pack for logging using it uses the following dependencies:
 ![alt text](image-1.png)

 spring-boot-starter-cache - is provided for using spring fraework's for caching . Caching is a temporary part of RAM where data is stored so that it can be accessed faster as compared with secondary memory

 spring-boot-starter-aop - is for aspect-oriented programming with spring AOP and this is used for using common behaviour across methods, classes, object, hierarchies and REST endpoints, it manages the cross cutting concerns for an application

 # Understanding auto-configuration
 Spring boot automatically configures a spring application based on the dependencies included in the class path