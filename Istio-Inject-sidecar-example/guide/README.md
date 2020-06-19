Stpes:
=====

Prerequisites for injecting ISTIO Sidecar proxy into our own micro service:
===========================================================================

1) Kubernetes Cluster must be installed

2) Istio must be installed - Refer /Istio-Config/ folder to install and verify

3) Our Microservices Docker image must be available in GCR - Refer /sash-client-microservice/ and /sash-hello-microservice/ folders.


Makesure you are in "/Kubernetes-playground/Istio-Inject-sidecar-example" path.

kubectl apply -f yamls/sash-hello.yaml

kubectl apply -f yamls/sash-rest-client.yaml

kubectl apply -f yamls/sash-hello-service.yaml

kubectl apply -f yamls/sash-rest-client-service.yaml

kubectl apply -f yamls/sash-ingress.yaml


Verify:
=======

http://35.190.34.71/quarkus/greeting   - This will invoke another internal microservice (sash-hello) using service discovery.
http://35.190.34.71/country/name/India  - This will invoke enternal API.


Different ISTIO Dashboards:
==========================
istioctl dashboard 

istioctl dashboard kiali
istioctl dashboard grafana
istioctl dashboard prometheus
istioctl dashboard jaeger
