# Kubernetes-playground

<h3>Deploy Quarkus Hello Service.</h3>

<b>Deployment:</b>

kubectl apply -f https://raw.githubusercontent.com/mosesalphonse/Kubernetes-playground/master/quarkus-hello-deployment.yaml

<b>Expose the service through LoadBalancer:</b>

kubectl expose deployment sash-quarkus --type=LoadBalancer --name=quarkus-hello-service

<b>verify:</b>

curl <External LB IP>:8080/hello
