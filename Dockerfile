FROM java:8
ARG JAR_FILE=target/SpringBoot-Actuator-Docker-Example-1.0-PROD.jar
WORKDIR d:/opt/app
EXPOSE 7002
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]