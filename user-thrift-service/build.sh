#!/usr/bin/env bash

mvn clean package
docker build -t faker322/user-service:latest .
docker push faker322/user-service:latest


#docker stop user-service:latest
#docker rm $(docker ps -a -q)
#docker rmi $(docker images|grep none| awk '{print $3}')
#docker run -it user-service:latest --mysql.address = 121.40.8.72