FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash

COPY run.sh /run.sh

ENTRYPOINT ["/run.sh"]

