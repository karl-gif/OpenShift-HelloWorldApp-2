FROM openjdk:8
ADD target/HelloWorldRESTAPI.jar HelloWorldRESTAPI.jar
EXPOSE 9021
ENTRYPOINT ["java", "-jar", "HelloWorldRESTAPI.jar"]