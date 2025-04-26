## Developing your first react application
# Objectives
In this chapter you will learn:
Starting with spring initializr
Building tools Maven and Gradle
Understanding pom.xml
Understanding duild.gradle
Building and application using maven
Building application using Gradle
Understanding the entry point class and SpringBootApplication annotation
Bootstrap ApplicationContext  

# Starting with spring initializr
For developing the springboot application from scratch, you can use the spring initialzr tool provided by the spring team that offers you the most commonly used dependancies, In this chapter we will develop one web-based application with one REST endpoint, which will help in understanding how to use the spring initialzr tool and test that endpoint from any web client such as and so on

To start with spring initialzr, follow the following steps:
Browse the following website on chrome:
https://start.spring.io

Screenshot of the page
![alt text](image.png)

Select project as maven
Select language as Java
Select spring boot version
Provide a suitable project metadata - group ID, artifact ID, name of the project, project description and package name

Select packaging as:

Add dependancies - Spring Web and Spring Boot

Click on Generate button
This will download the .zip file, extract and open on the workspace 

# Build tools Maven and Gradle
Maven is a project management build tool developed by Apache Org which adds the functionalities of java libraries through dependancies.
Developers can create their own dependencies for the purpose of modularity, They can also use the dependencies stored in the repository.
Maven is a stage-driven build tool and its lifecycle is divided into stages such as install, and The core components of the Maven project is build.maven file

Gradle is an open-source build tool which adds functionalities of Java libraries through plugins
Gradle is task-driven; the core model of the gradle decides the lists of task for a build cycle and bundles then in order of execution.
The lifecycle of the gradle build is divided into phases such as configuration, and the core component of the Gradle project is the build.gradle file

# Understanding the pom.xml
It is called the project object model where it stores the project-related metadata.
This file is used by the Maven build tool to download the dependancies required to build the project

The contents of pom.xml are as follows:
version=”1.0” encoding=”UTF-8”?>
xmlns=”http://maven.apache.org/POM/4.0.0”
xmlns:xsi=”http://www.w3.org/2001/XMLSchema-instance”
xsi:schemaLocation=”http://maven.apache.org/POM/4.0.0
https://maven.apache.org/xsd/maven-4.0.0.xsd”>
4.0.0
org.springframework.boot
spring-boot-starter-parent
2.4.3
com.author
kickstart
0.0.1-SNAPSHOT
kickstart
Demo project for Spring Boot
org.springframework.boot
spring-boot-starter-web
org.springframework.boot
spring-boot-devtools
runtime
true
org.springframework.boot
spring-boot-starter-test
test
org.springframework.boot
spring-boot-maven-plugin

# Building an application using Maven
Now you can launch SpringToolSuite4.exe application from the directory where you have installed STS

![alt text](image-1.png)

# Understand the entry point and SpringBootApplication annotation
The following snippet is the entry point class with the main function:

package com.author.kickstart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KickstartApplication {
    public static void main(String[] args) {
        SpringApplication.run(KickstartApplication.class, args);
    }
}

The @SpringBootApplication annotation describes the class where it is used in a spring boot application, this annotation is a combination of the following annotation:
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan