
## Spring Boot + Actuator + Docker Example using  SpringBoot 2.2.2


### Used technology stack in this example
	
	1. Java 8
	2. Apache Maven 3.5.4
	3. SpringBoot 2.2.2
	4. springBoot Actuator 2.2.2
	5. Docker Version: 19.03.8 - https://hub.docker.com/editions/community/docker-ce-desktop-windows/
	6. Postman Version 7.14.0
	7. Windows 10


### Use following URL to create spring boot initial application structure

	https://start.spring.io/


### Maven initial setup

	$ mvn dependency:tree
	$ mvn eclipse:eclipse


### Build application jar

	$ mvn clean package


## Docker Commands

## Command for Docker Image

	$ docker image build -t springboot-actuator-docker-example-image-1 .

## Command for Docker Container Create and Run

	$ docker container run --name springboot-actuator-docker-example-container-1 -p 7002:7002 -d springboot-actuator-docker-example-image-1

## Command for container logs

	$ docker container logs -f springboot-actuator-docker-example-container-1


### Test following actuator URLs

	http://localhost:7002/springboot-actuator-docker-example/actuator
	http://localhost:7002/springboot-actuator-docker-example/actuator/env
	http://localhost:7002/springboot-actuator-docker-example/actuator/health
	http://localhost:7002/springboot-actuator-docker-example/actuator/beans
	http://localhost:7002/springboot-actuator-docker-example/actuator/auditevents
	http://localhost:7002/springboot-actuator-docker-example/actuator/trace
	http://localhost:7002/springboot-actuator-docker-example/actuator/dump
	http://localhost:7002/springboot-actuator-docker-example/actuator/metrics
	http://localhost:7002/springboot-actuator-docker-example/actuator/info	
	