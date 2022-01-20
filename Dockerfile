FROM openjdk:8

VOLUME /tmp

EXPOSE 8080

RUN mkdir -p /app/

RUN mkdir -p /app/logs/

ADD target/baseball-app.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]