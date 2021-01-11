#!/usr/bin/env bash

mvn clean package
docker build -t faker322/course-edge-service:latest .
#docker pull faker322/course-edge-service:latest
docker push faker322/course-edge-service:latest
#docker build -t hub.mooc.com:8080/micro-service/course-edge-service:latest .
#docker push hub.mooc.com:8080/micro-service/course-edge-service:latest
