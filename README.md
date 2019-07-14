# two
Use below command to build jar,
mvn clean install

Use below command to build docker image,
set DOCKER_HOST=<docker_host>:2376 (Bydefault localhost is considered)
mvn dockerfile:build

