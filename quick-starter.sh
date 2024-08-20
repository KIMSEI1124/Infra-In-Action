#!/bin/bash

cd spring

chmod +x gradlew
./gradlew bootJar

cd ..
docker-compose -f docker-compose.spring.yml up -d