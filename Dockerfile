FROM openjdk:11
EXPOSE 8080
ADD target/conversion-api.jar conversion-api.jar
ENTRYPOINT ["java","-jar", "/conversion-api.jar"]