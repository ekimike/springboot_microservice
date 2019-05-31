# springboot_microservice


Master Microservices with Spring Boot and Spring Cloud
Ranga Karanam

git: github.com/in28minutes/spring-microservices


1. spring cloud config server and bus
2. load balancing with ribbon and feign
3. implement naming server with eureka
4. implementing api gateway with zuul
5. distributed tracing with zipkin
6. fault tolerance with hystrix


CREATING PROJECT WITH SPRING INITIALIZR
=======================================

web: start.spring.io
sts: Spring Starter Project

dependencies: web, devtools, jpa & h2

CREATING BASIC CRUD
===================

Using a simple bean we play with CRUD. Bear in mind that we're using:

* ResponseEntity<T> for @PostMapping

* throw personalized exception extending RuntimeException & @ResponseStatus(HttpStatus.NOT_FOUND)

* throw an exception with few details for all controllers: @ControllerAdvice & @RestController extending ResponseEntityExceptionHandler
