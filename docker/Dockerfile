FROM openjdk:9

ADD libs/ /opt/mq-dw/

ADD server.yml /opt/mq-dw/

WORKDIR /opt/mq-dw/

EXPOSE 8080

CMD ["bin/bash", "java", "-jar", "*.jar", "server", "server.yml"]