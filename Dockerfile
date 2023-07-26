FROM openjdk:8-jdk-alpine
LABEL maintainer="Erik Kitchen ekitche@gmu.edu"
WORKDIR /app
COPY springboot_studentsurvey_backend.jar /app/springboot_studentsurvey_backend.jar
ENTRYPOINT ["java","-jar","/app/springboot_studentsurvey_backend.jar"]