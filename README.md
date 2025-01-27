# m426-ToDoListApp

### Docker Command
```
docker run --name tdl -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=tdl -e MYSQL_USER=user
 -e MYSQL_PASSWORD=password -p 3306:3306 -d mysql:8.0
```