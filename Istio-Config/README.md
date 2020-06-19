install istioctl:
================

curl -L https://istio.io/downloadIstio | sh -

cd istio-1.6.2

export PATH=$PWD/bin:$PATH

Verify istioctl installation:
============================

which istioctl

istioctl version

istioctl profile list

apply profile:
=============
istioctl manifest apply --set profile=demo
or
istioctl install --set profile=demo

to watch pods:
=============
watch -x kubectl -n  istio-system get pods

generate manifest:
==================
istioctl manifest generate --set profile=demo

istioctl manifest generate --set profile=demo > /home/moses_alphonse/istio.yaml

verify istio:
============
istioctl verify-install -f /home/moses_alphonse/istio.yaml

Access Dashboards:
======================
istioctl dashboard

istioctl dashboard kiali
istioctl dashboard grafana
istioctl dashboard prometheus
istioctl dashboard jaeger


delete istio:
============

istioctl manifest generate --set profile=demo | kubectl delete -f -

kubectl delete namespace istio-system






