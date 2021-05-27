FROM openjdk:8
ADD target/currenttime.jar currenttime.jar
EXPOSE 8073
ENTRYPOINT ["java", "-jar", "currentime.jar"]