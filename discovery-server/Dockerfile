FROM openjdk:17-oracle

CMD ["./gradlew",  "bootJar","--no-daemon"]
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} discovery-server.jar
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]