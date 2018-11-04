# dapp-java
#
# 	PDX blockchain hypercloud sandbox for java-based smart-contracts 	
#
# VERSION 0.1

FROM openjdk:8-jre-alpine

LABEL maintainer="jz@pdx.ltd"

RUN apk add --no-cache bash

COPY run-java.sh /run.sh

ENTRYPOINT ["/run.sh"]

