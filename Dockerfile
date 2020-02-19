FROM g3.skb:8500/external-image/openjdk:8-jdk-alpine

COPY config /
ADD target/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prd","-jar","/app.jar"]