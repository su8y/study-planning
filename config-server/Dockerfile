FROM openjdk:17-oracle

VOLUME /tmp
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} config-server.jar
EXPOSE 8888

ENTRYPOINT ["java", "-jar", "config-server.jar"]
