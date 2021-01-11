#!/usr/bin/env bash
#docker build -t message-service:latest .




docker build -t faker322/message-service:latest .
#docker rm $(docker ps -a -q)
#docker rmi $(docker images|grep none| awk '{print $3}')
#docker run -it message-service:latest
docker push faker322/message-service:latest