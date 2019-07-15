# two
Use below command to build jar,<br>
mvn clean install<br>

Use below command to build docker image,<br>
set DOCKER_HOST=<docker_host>:2376 (Bydefault localhost is considered)<br>
mvn dockerfile:build<br>

To push the image to docker hub(default),<br> 
mvn dockerfile:push<br>
Note: Login with credentials before running this command


