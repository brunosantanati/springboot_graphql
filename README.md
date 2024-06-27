## Run Configuration

Use this VM Option `-Dspring.profiles.active=dev`

## Docker commands

```
Spin up a MySQL container:
docker run --name my-mysql --network my-bridge-network -e MYSQL_ROOT_PASSWORD=mypass -d mysql:latest

Find out the IP of the MySQL container:
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' my-mysql

Connect in the MySQL using a client:
docker run -it --network my-bridge-network --rm mysql mysql -h172.21.0.2 -uroot -p
```
