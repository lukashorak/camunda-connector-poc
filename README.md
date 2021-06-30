# Camunda Connector POC

# Start
`mvnw spring-boot:run`

[Open](http://localhost:8080)

demo/demo


# Docker Image

```
mvnw spring-boot:build-image

docker run -it -p8080:8080 connector-poc:0.0.1-SNAPSHOT
```