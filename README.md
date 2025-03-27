# Notes
## week 1
- Data types x 8:
  - int byte short long double float
  - boolean & char
  - operator
    - math (++x; x++; %; +=; -=; *=; /=)
    - comparsion (==; !==; <; >; <=; >=) -> primitives
      - and(&&); or(||); not(!)
  - String (anything) 
  - equals(String) length() charAt(int)
  - if, else, else if
  - for(i = 0; i < 10; i++){
  - break/continue
  - }
  - for + if(loop all elements + filtering)
    - searching for + if
## week 2
- while loop(for loop / while loop)
- for-each loop(simple design of for loop)
- arrays(support 17 types of value)
- 8 wrapper class (8 primitives)
- String methods
- Methods (similar to Fomula)
  - Input paraments
  - Return types
  - Method name
  - Method signature = input params + method name
- BigDecimal
# Week 3
- Class and Object
Example: Customer/ Order/ Item
Example: Person
Example: Human (bmi)
- Static Variable
Example: Supermarket & Worker , Supermarket2 & Worker2
- Static Method
Example: Circle, LoanCalculator
Java League of Legends Ex1 - Hero

# Week 4
- APIE
  - Abstraction (Interface)
  - Polymorphism (static & dynamic)
  - Inheritance (Parent Class & Abstract Class)
  - Encapsulation 
- Class & Object
Example: Deck & Card
Example: Library, Book & Librarian
- Static Variable
Example: Candy & Student
- Class & Object
Example: Candy2 & Student2 & Teacher
Java League of Legends Ex2 - Weapon

# Week 5
- Data Structures
  - ArrayList, HashSet, LinkedList (Node)
  - HashMap, ArrayDeque, PriorityQueue
  - List, Map, Queue, Deque, 
- Understand the underlying DS difference between ArrayList & LinkedList
Class Exercise: ArrayListExercise.java
Class Exercise: StockPriceTracker.java
Class Exercise: RealStockPriceTracker.java
- Collections.sort(), Comparable & Comparator
- Generic

# Week 6
- Exception 
  - Checked Exception & Unchecked Exception
  - Exception.class & RuntimeException.class
  - Exception Handling: try, catch, finally & throws
  - throw for Exception Object
  - throws for method signature
  - Built-in Exception & RuntimeException class
Class Exercise: ExceptionExercise1.java
Class Exercise: ExceptionExercise2.java
Class Exercise: ExceptionExercise3.java
Class Exercise: ExceptionExercise4.java
- Lambda Expression (Function, Predicate, Consumer, Supplier)
- Stream & Optional
- Thread
  - Runnable for tasks
  - Create, start & manage threads
  - Thread-safe Data Structures in Collection
  - synchronized & Atomic
- Builder Pattern & Factory Pattern (Coding Pattern)
- Switch Expression, Type Inference, Record
Class Exercise: StreamExercise.java
- Big-O notation
  - Understand Time & Space Complexity
  - Data structures for managing Complexity
- Recursive

# Week 7
- MySQL DBMS
- DDL (create, drop, alter table, etc) for structure changes
- DML (insert, update, delete)
- Operators: math operators, exists, in, etc.
- Manipulation Operators: String, Math, Date functions, etc.
- Aggregation Functions: count(), sum(), min(), max(), avg()
- Group by & Having (together with aggregation functions)
- Inner Join & Left Join
- Union & UnionAll
- SQL skills: Use CTE (with), instead of sub-query
- Tables Relationshiop
  - Constraints: PK, FK, NOT NULL, UNIQUE
  - One-to-one, One-to-many, Many-to-many
- Table Design & Normalization (BCNF)

# Week 8 (CNY)
- Leetcode For SQL (Target to complete all by Week 15)
- Maven Project Structure & pom.xml
- Maven Commands
  - mvn clean compile
  - mvn clean test
  - mvn clean install
- Maven + Lombok
- SQL Exercise 1
- Database: Index for tables, View, Materialized View, Stored Procedure

# Week 9
- SQL Exercise 2
- SQL Exercise 3
- SQL Exercise 4
- Maven + Junit5
- Dependency injection for unit test
- Test Framework: Mockito
- Class Exercise - Bank Systems & Furniture
- Spring Boot MVC

# Week 10
- Maven + Spring Boot Framework
- RESTful API (Controller)
- Service Functions (Service)
- Custom Beans (Configuration)
- GlobalExceptionHandler
- Spring Boot Exercise 1: Simple Calculator
- Postman
- JSON, XML & YAML
- Concepts of Server & Client
- Concepts of SpringContext & Beans
- SpringBootTest, WebMvcTest, MockMvc, etc.

# Week 11
- Database (Repository + Entity)
  - MySQL, PostgreSQL & H2
- JPA, JPQL, Native Query
- Invoke external API (RestTemplate)
- Data Transfer Object (DTO) + Mapper Coding Style
- Read Custom Variable from yml (@Value)
- ApiResp.class (enum SysCode, BuesinessException.class)
- Concepts of Dependency Injection (DI), Inversion of Control (IoC)
- Concepts of Microservices vs Monolithic Applications
- Spring Boot Exercise 2: Data Transfer (JsonPlaceHolder) 
- Spring Boot Exercise 3: Data Storage (JsonPlaceHolder)
- DataJpaTest, MockBean, SpyBean, etc.
- Serialization & Deserialization

# Week 12
- Redis Usage for Spring Boot
  - RedisTemplate
  - RedisManager for Encapsulation
  - Cache Aside Pattern
- AWS
  - EC2, Security Group & Key Pairs
  - Application Load Balancer & Target Group
  - CloudFront
  - Route53
  - RDS / ElastiCache Redis
- Docker
  - Docker Desktop
  - Dockerfile for Spring Boot Project
  - Docker Images
  - docker build & docker run
  - docker compose
  - Docker Demo Project
    - Understand localhost vs docker engine enviroment
- Spring Boot Exercise 4: MTR
- Concept of Cloud (What, Why & How)
- Concepts of Private, Hybrid & Public Cloud
- Concepts of Agile VS Waterfall
- Concepts of DevOps
- Concepts of Cloud Implementations
  - On Premises
  - Infrastrucutre as a Service (IaaS) - AWS EC2
  - Container as a Service (CaaS) - AWS ECS & EKS
  - Platform as a Service (PaaS) - AWS RDS
  - Function as a Service (FaaS) - AWS Lambda
  - Software as a Service (SaaS) - Google Drive & Gmail

# Week 13
- CommandLine Runner
- Scheduling Task
- Thmeleaf for Spring Boot Frontend
  - Server rendering for html, css & js
  - View Controller
  - Interaction with RestController
  - Demo Project for Coingecko
- Vue.js
  - Modern Frontend Framework
  - Frontend Backend Connection
- Spring Boot Exercise 5: Coin Page (Thymeleaf + jQuery + AJAX)
- Coding Design Patterns & Principles
  - SOLID
  - Singleton
  - Early Return
  - Clean Code

# Week 14
- Final Project
  - I. Yahoo Finance Manager
  - II. Financial Data Service
- Concepts of Request Headers, Cookies, etc.

# Week 15
- Final Project
  - III. Responive Line Chart
  - IV. Historical Candlestick Chart
  - Further Enhancements:
    - AWS deployment
    - Main Page (Company News, Search Bar for page jump)
    - Support both HK & US Stocks
    - Additional products, other than stocks
    - User Login + Custom Conditions & Notifications
- Swagger (OpenAPI Spec)
  - Design First and Code First
- Jmeter (Load Test)
- Actuator (production ready feature)