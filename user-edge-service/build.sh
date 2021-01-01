#!/usr/bin/env bash
#mvn clean package
#
#docker build -t hub.mooc.com:8080/micro-service/user-edge-service:latest .
#docker push hub.mooc.com:8080/micro-service/user-edge-service:latest


mvn clean package
docker build -t user-edge-service:latest .
docker rm $(docker ps -a -q)
docker rmi $(docker images|grep none| awk '{print $3}')
docker run -it user-edge-service:latest --redis.address = 18.222.223.9