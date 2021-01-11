#!/usr/bin/env bash

mvn clean package
docker build -t faker322/course-service:latest .

#docker pull faker322/course-service:latest
docker push faker322/course-service:latest
# 关掉所有
#docker rm $(docker ps -a -q)
#docker rmi $(docker images|grep none| awk '{print $3}')
#docker run -it course-service:latest --mysql.address = 121.40.8.72