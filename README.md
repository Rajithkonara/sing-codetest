# Set Up locally 
  Prerequisite

  - Java 8
  - Apache Maven 3.5.0 or higher 

 Set Up instructions

 - Clone the repo git clone https://github.com/Rajithkonara/sing-codetest.git 
 - cd sing-codetest
 - mvn clean install

 Running the micro service

- cd target
- java -jar target/singtel-code-1.0-SNAPSHOT.jar
- the microservice will run on port 8080

 Sample API request and responses

- Get Fish By name

Request 
```sh
GET  http://localhost:8080/api/v1/animal/fish?name=shark
```
Response 

```sh
{
    "color": "Grey",
    "size": "Large",
    "makeJokes": false,
    "predator": true,
    "name": "Shark"
}
```
- Get Bird By name

Request
```sh
GET http://localhost:8080/api/v1/animal/bird?name=parrot

```
Response 
```sh
{
    "name": "Parrot"
}
```