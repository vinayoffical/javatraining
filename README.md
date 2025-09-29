Git--> version control tool
In order to manage the code base


feature/Branch --> added the code 
Main/ Develop --> Develop environment (developer)
Release --> SIT/UAT (System Integration Test (QA))/User Acceptance Testing 
Tag --> Production(Release) --> End user


Git commands-->
1. Cloning the repo in local
git clone <ssh Repo Url>
2. For creating new branch 
git checkout -b <branch_name>
3. To push the changes to remote
git push
4. to commit the changes
git commit -m'<Message>'
5. For switching branch 
git checkout
6. For taking the latest code from remote repo
git pull

Java Basic
1. Var ags
2. Static method can call another static method
3. Static Block execute always first and only one time
4. Overloading and Overriding
5. Overriding Rule
    you can't limit the scope
    you can't throw child exception 
6. Interfaces (Java 8 interface updates) -- static and default method 
7. Abstract Class and interface--> variable of abstract class can be private protected 
    you can implement multiple interface but can't extends multiple abstract
8. Java don't support multiple inheritance.
9. Marker Interface --> serializable, cloneable 
    Provides instruction to do something don't have any method
10. Functional Interface -->@FunctionalInterface --> Lambda Expression
    That contains single abstract method
    example-> comparable,comparator, runnable
11. Exception --> Checked and Unchecked
12. RuntimeException --> is the base class for all the Unchecked
13. Exception Handling--> try catch finally throw and throws
                            Throwable
                    Exception         Errors
               Runtime                OutOfMemory,StackOverflow
Stack is Last In first out 
Queue is First In First out 
14. Collection Framework --> 
                        Iterable(Interface)
                        Collection(Interface)
            List(Interface)    Set(Interface)          Queue(Interface)
            ArrayList(class)   HashSet(class)          PriorityQueue(class)
            LinkedList(class)  LinkedHasSet(class)     ArrayDeque(class)
            Vector(class)      TreeSet(class)
            Stack(class)
Project Started 
Oracle v2012 --> jdbc v12// removed even 
Oracle v2025 --> jdbc v25
For example you company
15. Dependency Management --> maven 
Apache Maven is a build automation and project management tool.
    * Build lifecycle (compile, test,package,deploy) mvn clean install 
    * Dependencies
    * Project Structure(standard director layout)
    * Plugins & goals(extend build capabilities)
    * Project documentation and reporting

Key features
1. Dependency management
2. Convention over Configuration 
3. Build Lifecycle clean(remove old build files) , default(compile,test,package,install,deploy) ,site 
4. Plugins 

important commands:
mvn clean
mvn install
mvn compile
mvn package

16. Docker is an open source platform that allows developers to build, package and run applications inside containers.
A container is a lightweight,standalone and portable unit that contains everything need to run an application: code, runtime
libraries and dependencies. 

Before Docker , developers face the common problems:
* "It works on my machine" 
* Complex setup and dependency conflicts
* Slow deployment cycles.

Key Concepts:
* Image 
  * A blueprint for containers.
  * contains application code + dependencies.
* Container 
  * A running instance of an image.
  * Lightweight and isolated but share the host OS kernel.
  
* DockerFile
  * A script with instruction to build the image.
* Docker Hub
  * A public registry to share and download images
* Docker Engine
  * Core part of Docker that runs and manages containers.

Benefits of Docker
* Portability
* Scalability
* isolation 
* Speed 

Kubernetes:
K8s is an open source container orchestration platform.
It automates the deployment scaling and management of containerized applications

Client --> Server (Load Balancer) 


Order Service(Producers)  --> orderds
Restaurant Service(Consumer)
Delivery Service(Consumers)
Notification(Consumers)

Spring Boot:

Spring Boot is a framework built on top of the Spring Framework that makes it easier to create production ready
stand-alone applications quickly with minimum configuration.

Key Features of Spring Boot:
1. Auto-configuration:
    * Automatically configures beans and dependencies based on what's available on classpath(eg if you add Spring web depedency
   it automatically Configures tomcat and MVC).
2. Standalone Applications:
   * No need for an external server(Tomcat/Jetty). Application can be run by simple java -jar.
3. Embedded Servers
4. Production Ready Features


Spring Profile
A Spring Profile is way to group and manage different configuration for different environments.
(like dev, sit,uat and prod).

java -jar <buildName>.jar --spring.profiles.active=dev

Spring Framework:

The Spring framework is a lightweight open source framework for building java applications.
It provides infrastructure support so developers can focus on business logic instead of boilerplate code
(like creating object,managing transactions or handling security).

Core features of Spring:
1. Inversion of Control(IoC) / Dependency Injection(DI)
    Instead of classes creating their own dependence Spring injects them at runtime.
2. Aspect Oriented Program:
   Separates cross-cutting concerns( logging,transaction and security )from business logic.
3. Data Access Layers
   Simplifies working with JDBC,Hibernate and JPA.
4. Spring MVC
5. Spring security
   Provides authentication, authorization and security feature.
6. Spring Testing

Spring JDBC:
Spring JDBC is a part of spring framework that simplifies working with relational databases using JDBC(Java Database
Connectivity).
Normally plain JDBC requires a lot of boilerplate code:
* Load the driver
* Open Connection
* Execute query
* Process results 
* Closes resources
    
Spring JDBC reduces all this by using JDBCTemplate and handles resource management automatically.

Key Features of Spring JDBC:
1. JdbcTemplate
2. Exception Translation
3. RowMapper maps rows from ResultSet to java objects
4. Automatic Resource management

Hibernate:
Hibernate is a Java based ORM(Object Relational Mapping) framework for mapping Java Object(POJOs) to relational
database tables.

Instead of writing raw SQL queries and handling JDBC code, you can define entity classes in java dn Hibernate
automatically manages database interactions(CRUD, join,relationship etc).

Spring Microservices:
Spring microservices is an architectural approach where a large application is built as a collection of 
small,independent, and loosely copied services.
Each service is focused on specific business capability runs in its own process and communication with 
other services using lightweight protocols( usually HTTP/REST,messaging).
when implemented with Sprig Boot and Spring cloud, building microservice becomes simpler because Spring 
provides ready to use tools.

Concepts of Spring Microservice:
1. Spring Boot:
   * Provides a framework to build standalone service quickly,
   * Autoconfiguration and embedded servers.
   * Each microservice runs independently.
2. Spring Cloud:
   * A collection of tools to manage microservice in distributed systems.
   * Helps with service discovery,configuration,load balancing,fault tolerance and API gateways.
3. Service Discovery(Eureka Service/ Client)
   * Each service register itself with a discovery server(like Netflix Eureka).
   * Client doesn't need to know exact service URLs they just ask the discover server.
4. API Gateway(Spring Cloud Gateway/ Zuul)
   * Acts a single entry point to microservices.
   * Provides routing, load balancing, authentication ,logging and monitoring
5. Centralized Configuration(Spring Cloud Config)
    * Stores all configuration files in one place (Git SVN or filesystem).
    * Microservice fetch configuration dynamically.
6. Load Balancing(Ribbon/ Spring Cloud LoadBalancer)
    * Distributes requests across multiple instance of microservices.
7. Fault Tolerance and Resilience(Resilience4J/ Hystrix)
   * Handles failures gracefully with circuit breakers, retries ,bulkheads,fallbacks.
8. Communication:
   * Synchronous - REST APIs with Feign Client.
   * Asynchronous - Messaging with kafka, Rabbit MQ.
9. Distributed Tracking & Monitoring(Sleuth + Zipkin, Micrometer+Prometheus+Grafana)
    * Traces requests across service.
    * Monitors performance and availability.
10. Containerization & Orchestration:
    * Microservice packages as Docker containers.
    * Managed by Kubernetes for scaling deployment and self-healing.

Advantages:
* Scalability: Each microservice can scale independently.
* Flexibility -> Different team can work on different service.
* Resilience --> failure of one service doesn't bring whole system down.
* Faster Deployment --> Independent release cycles.

Challenges:
* complexity in communication and data consistency.
* Requires DevOps automation (CI/CD)
* Monitoring and debugging across service is harder