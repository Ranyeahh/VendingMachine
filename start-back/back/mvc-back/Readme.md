## 后端——Java + SpringBoot + gradle

### 版本：jdk 17 

### 目录结构：

start-back
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.mvcback/
│   │   │       ├── config/
│   │   │       │   └── WebConfig.java
│   │   │       ├── controller/
│   │   │       │   └── BeverageController.java
│   │   │       ├── factory/
│   │   │       │   ├── BeverageFactory.java
│   │   │       │   └── DecoratorFactory.java
│   │   │       ├── model/
│   │   │       │   ├── Beverage.java
│   │   │       │   ├── BeverageRequest.java
│   │   │       │   ├── Coca.java
│   │   │       │   ├── Coffee.java
│   │   │       │   ├── Decorator.java
│   │   │       │   ├── IceDecorator.java
│   │   │       │   ├── MilkDecorator.java
│   │   │       │   └── NoDecorator.java
│   │   │       └── service/
│   │   │             └── MvcBackApplication.java
│   │   └── resources/
│   └── test/
└── settings.gradle


# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.3/gradle-plugin/packaging-oci-image.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.3/reference/using/devtools.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.3/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

