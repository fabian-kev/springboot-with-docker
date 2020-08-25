#!/bin/sh
docker rm user-container;
docker image rm user-img;
docker build -t user-img . ;
docker run -p 666:8000 --name user-container user-img ;