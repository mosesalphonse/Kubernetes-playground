Build and push the image into Repo:
=================================

mvn clean package

docker build -f src/main/docker/Dockerfile.jvm -t quarkus/rest-client-jvm .

docker tag quarkus/rest-client-jvm:latest gcr.io/moses-k8/sash-client:1.0.0

docker push gcr.io/moses-k8/sash-client:1.0.0

Note: 

1) In application.properties, value for 'org.acme.rest.client.HelloService/mp-rest/url' should have the correct kubernetes 'service' for service discovery.

example:
http://sash-hello-service.default.svc.cluster.local:8080/sash-hello

where 'sash-hello-service' is the name of the kubernetes service name.

2) Make sure you have the above created image in the image registory.


Testing endpoints:
==================
 curl <<hostname>>:8080/quarkus/greeting
 
 curl <<hostname>>:8080/country/name/uk


