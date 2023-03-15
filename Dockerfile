FROM openjdk:11
EXPOSE 8080
ADD target/store-service-java-image.jar store-service-java-image.jar
ENTRYPOINT ["java","-jar","store-service-java-image.jar"]