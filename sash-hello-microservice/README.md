Build and push the image into Repo:
=================================

mvn clean package

docker build -f src/main/docker/Dockerfile.jvm -t quarkus/getting-started-jvm .

docker tag quarkus/getting-started-jvm:latest gcr.io/moses-k8/sash-hello:1.0.0

docker push gcr.io/moses-k8/sash-hello:1.0.0

Note: make sure you have the above created image in the image registory.

testing endpoints:
 curl <<hostname>>:8080/sash-hello/hello
