## Spring boot annotations
# Objectives
In this chapter we will lrean annotations created in the spring boot framework which favors the developer to save time in writting the configuratiions in the old convention - XML.

# Java annotations
Java annotations are used to provide some kind of metadata to the java compiler and JVM
They are embedded within the source code which tells the compiler about the behaviour of the field, class, interface or method
It starts with symbol @ followed by the name of the snnotations

# Existence of spring annotations
Spring and spring boot annotations can be classified into the following:
Core spring framework annotations
Spring framework stereotype annotations
Spring boot annotations
Spring task execution annotations
Spring profiles annotations

# 1. Core Spring framework annotations
@Bean
Is an annotation used on top of a method and act as areplacement of the XML element

@Autowired
It is used to mark a constructor, field or setter method to get autowire by Spring DI

@ComponentScan
Looks for components defined in the directories and allows them to configure to the spring container 

@Configuration
Indicates thet the class has one or more beans that can be used throught the project and can be processed by the spring container to generate other bean definition

@ConfigurationProperties
This is an advance way of using the configuration defined in properties 
or yml files while comparing the way it used to be while using @Value for fetching properties

@TestPropertiesSource
While writting JUnits for integration testing, one may configure the runtime properties for the classes which are fetching values from property files

@Lazy
This annoatation is used to specify that the beancan be initialized later when used.
This annotation cn b e used within a class that is annoted with
This annotation can flip the laziness by changing the default value from true to false

@Qualifier
There would be scenarios where there are multiple beans inheriting the same parent class
This annotation requires the same bean name for autoworing or injecting into the target

@Primary
This indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency 

@Value
This annotation iscused to pick up the values from the application*.properties or application*.yml files.
It can be used as the field or method/constructor parameter level that stores the default values present in properties
The value expression such as #{systemProperties.pyProp} or property placeholder

# Spring framework stereotype annotations
Stereotype annotations are the annotations that denote the roles of types or methods in the overall architecture
They are used at class levels
The syntax for using the annotation is as followes:

@Component
public class MyComponent {

}

@Controller
This indicates that an annoted class is a, This annotation serves as a specialization of @Component that allows you to implement classes to be autodetected through classpath scanning.
It is used with @RequestMapping and @ResponseBody annotations for developing web APIs

@Repository
This indicates that the annoted class is a This is used when application involves retrievals, storage or search on the database or collection of objects

package com.author.kickstart.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.author.kickstart.interfaces.impl.Car;
@Repository
public interface MyRepository extends CrudRepositoryString> {
}

@Service
This indicates that an annoted class is a ...

For the best fit, use @Service when you are interacting with a database via an interface or having calculations. Use @Repository when you have a database where you need to perform Create, Retrieve, Update, and Delete operations as internally any interface annotated with @Repository injects the database handling code and throws database-related runtime exceptions. @Controller can be used in conjunction with @ResponseBody for creating APIs and making them accessible to use services provided by an application.

# Spring boot annotations
@EnableAutoConfiguration
This annotation is very useful in terms of the working of Spring Boot under the hood. This annotation enables auto-configuration of the Spring application context which detects all the beans which you want to use within the application for which the dependency is included. Auto-configuration classes are usually applied on the classes that are included in the class path and the beans which you have created.

@SpringBootApplication
This annotation is a combination of three annotations and this makes it easier to use the preceeding annotations by using a single annotation

@SpringBootConfiguration
This is aspecialized @Configuration annotation that can be used above it should be also only once throught the source code.
After the global release of Spring Boot the @Configuration in the @SpringBootApplication annotation got replaced with the @SpringBootConfiguration annotation.

# Spring task execution annotations
The following are few annotations that are used for schedulling tasks and taking the decision to create a separate thread for its execution

@Async
This annotation is used to mark a method to start a separate thread for its asynchronous execution
The return type for the @Async method are restricted to have void or the method is not supported on methods that are declared within a class

@EnableSchedulling
It enables the springs task execution capability. In spring you can schedule a task to run on periodic timings automatically, it enables detection of any @Scheduled annotation used.

@Scheduled
This annotation is used to mark the method to be scheduled at the given period of time

# Spring profiles annotations
Going forward to advancement of microservices, the running profile can be changed by managing different profiles in application*.properties or application*.yml configuration files. These profiles can be selected at runtime depending on the value of The following annotations are used for profiling:

@Profile
This annotation tkes a string or string array for the names o the enviroment for which the following class should have its bean created

@ActiveProfiles
This annotation takes a string or string array for the names of the enviroment for which we will run test cases to load those profiles

# Jakarta annotations
The following are the annotations placed within the jakarta annotations-api library. These annotations are called within the lifecycle of the bean.

@PreDestroy
This annotation when used on top of a method notifies the container to call this method whenever the bean is no longer required to be referenced

@PostConstruct
This annotation when used on top of methods notifies the container to invoke the method whenever the bean instantiation is completed for any initialization to bean properties
This method must be invoked before the class is put iinto service