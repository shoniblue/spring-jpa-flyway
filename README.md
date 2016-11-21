# spring-jpa-flyway


Required:
Docker
Maven
Java 8


Prerequisite:
MySql DB running in container.   Use Docker run command:

```bash
docker run -d \
    --name prototypedb \
    -e MYSQL_ROOT_PASSWORD=p4SSW0rd \
    -e MYSQL_DATABASE=demo \
    -e MYSQL_USER=dbuser \
    -e MYSQL_PASSWORD=dbp4ss \
    mysql:latest
```

To build (and create docker image):
```bash
mvn install package
```
The initial run will take a few as it requires installing ubuntu on the container host. Proceeding builds will take moments.

To run container:
```bash
docker run -it --name=spring-jpa-flyway -l prototypedb:prototypedb -p 42444:42444 -e spring.profiles.active=dev sblue/spring-jpa-flyway
```

