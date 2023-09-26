FROM openjdk:17-oracle
CMD ["./gradlew", "clean", "bootJar","--no-daemon"]
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]