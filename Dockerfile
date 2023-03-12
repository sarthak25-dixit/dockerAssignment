FROM openjdk:17
RUN mkdir /app
WORKDIR /app
COPY target/dockerTask-0.0.1-SNAPSHOT.jar /app
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "dockerTask-0.0.1-SNAPSHOT.jar"]