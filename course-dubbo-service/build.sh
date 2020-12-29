#!/usr/bin/env bash

mvn clean package
docker build -t course-service:latest .
# 关掉所有
docker stop course-service:latest
docker rm $(docker ps -a -q)
docker rmi $(docker images|grep none| awk '{print $3}')
docker run -it course-service:latest