#!/usr/bin/env bash

mvn package

docker build -t faker322/api-gateway-zuul:latest .
#
docker push faker322/api-gateway-zuul:latest