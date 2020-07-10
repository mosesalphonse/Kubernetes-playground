# Steps to setup Istio Routing


#Prerequisites

a) Kubernetes Cluster

b) Istio installation



Perform the Below Steps:

1) get into Kubernetes-playground/Istio-Routing/ folder.

2) kubectl apply -f quarkushello-v1.yaml

3) kubectl apply -f quarkushello-gateway-v1.yaml

Now the above resources are linked with istio-ingressgateway's default port(80)


# Steps to verify:

curl {istio-ingressgateway-endpoint:80}/

example :

http://0.0.0.0/

curl {istio-ingressgateway-endpoint:80}/hello

example :

http://0.0.0.0hello

curl {istio-ingressgateway-endpoint:80}/health

example :

http://0.0.0.0/health
