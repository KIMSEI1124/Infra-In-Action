#!/bin/bash

DOCKER_NAME=deployment-automaion-server

echo "❌  Stop Docker Container"
if [ "$(docker ps -q -f name=${DOCKER_NAME})" ]; then
    echo "Stopping container: ${DOCKER_NAME}"
    docker stop ${DOCKER_NAME}
    docker rm ${DOCKER_NAME}
else
    echo "Container ${DOCKER_NAME} is not running."
fi

echo "❌  Remove Docker Image"

if docker image inspect ${DOCKER_NAME} &> /dev/null; then
    echo "Removing image: ${DOCKER_NAME}"
    docker image rm ${DOCKER_NAME}
else
    echo "Image ${DOCKER_NAME} does not exist."
fi
