FROM openjdk:8

ADD libs/*-all.jar /opt/mq-dw/

ADD server.yml /opt/mq-dw/

WORKDIR /opt/mq-dw/

EXPOSE 8080

CMD ["/bin/sh", "-c", "java -jar *.jar server server.yml"]