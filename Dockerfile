FROM adoptopenjdk:17-jre-hotspot
LABEL maintainer="Erik Kitchen ekitche@gmu.edu"
WORKDIR /app
COPY ./target/springboot_studentsurvey_backend.jar /app/springboot_studentsurvey_backend.jar
ENTRYPOINT ["java","-jar","/app/springboot_studentsurvey_backend.jar"]