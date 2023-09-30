FROM openjdk:17-oracle

VOLUME /tmp
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} gateway.jar
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "gateway.jar"]
