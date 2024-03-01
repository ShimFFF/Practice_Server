FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} service.jar
ENTRYPOINT ["java","-jar","/service.jar"]