# Services/Microservice Architecture (MSA)

## HTTP
1.	What is a “web service”? What’s the advantage of distributing software as a web service?
2.	What’s the difference between REST and SOAP services?
3.	What does HTTP stand for?
4.	What are the components inside of an HTTP request? What about an HTTP response?
5.	What are the important HTTP verbs / methods and what do they do?
6.	Which are idempotent?
7.	Which are safe?
8.	List the levels of HTTP status codes and what they mean
9.	What are some specific HTTP status codes that are commonly used?
10.	What is service-oriented architecture (SOA)?

## SOAP
1.	What does the acronym SOAP stand for?
2.	What protocols and data format do SOAP services use?
3.	What is the “contract” for a SOAP service?

## REST
1.	What does the acronym REST stand for? What makes a service “RESTful”?
2.	What protocols and data format do REST services use?
3.	What are the architectural constraints of REST?
4.	Explain the levels of the Richardson Maturity Model
5.	Explain the HATEOAS concept
6.	What is a “resource” in a REST service?
7.	What does the “uniform interface” constraint mean? Give an example of some RESTful endpoints you would create for an API. Should the URLs contain nouns, verbs, or adjectives?
8.	How would you implement authentication/authorization in a RESTful web service while maintaining statelessness?

## Microservices
1.	Compare the microservice and monolithic architectures. What are the advantages / disadvantages of each?
2.	Can a Java microservice communicate with a Node.js microservice? Why or why not?
3.	What’s the difference between horizontal and vertical scalability? Which way do monoliths and microservices typically scale?
4.	What are some best practices for building microservices?
5.	What is a messaging queue and how is using one different from calling service APIs directly?
6.	What is a “replica”?
7.	Explain the design patterns associated with microservices we've discussed.
8.	How would you setup and configure Consul?Spring Cloud Gateway? Resilience4j?
9.	What is the purpose of an API gateway and how does Spring Cloud Gateway perform this?
10.	What is service discovery and how does Eureka/Consul do this?
11.	What is the circuit breaker pattern and how does Hystrix implement it? What are the different circuit states?
12.	Is there any order in which you need to spin up these services?

## Docker
1.	What is containerization?
2.	How are containers different from virtual machines?
3.	What is a Docker image? container?
4.	List the steps to create a Docker image and spin up a container
5.	What is the relevance of the Dockerfile to this process? List some keywords in the Dockerfile
6.	What are some other Docker commands?
7.	What is a container registry? How would you retrieve and upload images to DockerHub?
8.	What is container orchestration? How does Docker Compose/Kubernetes help with this?