#!/bin/bash
./gradlew clean bootJar

docker build -t "spring/loadbalancer:0.0.1" .