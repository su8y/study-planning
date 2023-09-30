FROM openjdk:17-oracle

VOLUME /tmp
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} discovery-server.jar
EXPOSE 8761

ENTRYPOINT ["java", "-jar", "discovery-server.jar"]