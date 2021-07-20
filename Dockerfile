FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
RUN mkdir /opt/app
ADD target/people-service-1.0.0.jar /opt/app/people-service-1.0.0.jar
WORKDIR /opt/app
CMD ["java", "-jar", "/opt/app/people-service-1.0.0.jar"]
