# gcloud-app

mvn clean package

mvn appengine:run

mvn appengine:deploy

System Endpoint

curl http://my-kubernetes-248208.appspot.com/properties

Compute Endpoints

curl --header "project-id: my-kubernetes-248208" --header "zone: europe-west2-a" http://localhost:8080/instances

curl --header "project-id: my-kubernetes-248208" --header "zone: europe-west2-a" https://my-kubernetes-248208.appspot.com/instances

Datastore Endpoints

curl http://my-kubernetes-248208.appspot.com/task/list

curl http://my-kubernetes-248208.appspot.com/task/add

curl http://my-kubernetes-248208.appspot.com/datastore/properties


Cloud Storage Endpoints

curl http://my-kubernetes-248208.appspot.com/storage/properties

curl http://my-kubernetes-248208.appspot.com/storage/bucket/my-buck-26111986