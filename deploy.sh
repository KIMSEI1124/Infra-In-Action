#!/bin/bash

DOCKER_NAME=deployment-automaion-server

echo "🚀 Start bootJar"

chmod 755 gradlew
./gradlew clean bootJar

echo "🐬 Start build Docker image"
docker build \
  -t deployment-automaion-server \
  .

echo "❌  Stop Docker Container"
if [ "$(docker ps -q -f name=${DOCKER_NAME})" ]; then
    echo "Stopping container: ${DOCKER_NAME}"
    docker stop ${DOCKER_NAME}
    docker rm ${DOCKER_NAME}
else
    echo "Container ${DOCKER_NAME} is not running."
fi

echo "🤖 Start Docker Container"
docker run -d \
  --name ${DOCKER_NAME} \
  -p 8080:8080 \
  deployment-automaion-server