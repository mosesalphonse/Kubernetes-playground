# Kubernetes-playground

<h3>Deploy Quarkus Hello Service.</h3>

<b>Deployment:</b>

kubectl apply -f https://raw.githubusercontent.com/mosesalphonse/Kubernetes-playground/master/quarkus-hello-deployment.yaml

<b>Expose the service through LoadBalancer:</b>

kubectl expose deployment sash-quarkus --type=LoadBalancer --name=quarkus-hello-service

<b>verify:</b>

curl {External LB IP}:8080/hello



<h3>Deploy Quarkus Vertx Service.</h3>

<b>Deployment:</b>

kubectl apply -f https://raw.githubusercontent.com/mosesalphonse/Kubernetes-playground/master/quarkus-vertx-deployment.yaml

<b>Expose the service through LoadBalancer:</b>

kubectl expose deployment sash-vertx-deployment --type=LoadBalancer --name=quarkus-vertx-service

<b>verify:</b>

curl {External LB IP}:8080/async/{name}

curl {External LB IP}:8080/hello/{name}

curl {External LB IP}:8080/hello/{name}/streaming

curl {External LB IP}:8080/hello/{name}/object

curl {External LB IP}:8080/hello/{name}/array
