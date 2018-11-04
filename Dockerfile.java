FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash

COPY run-java.sh /run.sh

ENTRYPOINT ["/run.sh"]

