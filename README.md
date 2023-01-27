# mvn-sample-app

This is a maven sample application. Exposes default actuator endpoints plus `/` to send a string response and log `APP_USER` env variable and `/error` to throw an exception.

## Run

Run the project by `mvn spring-boot:run`

## Package

Package the project by `mvn clean package`

## Docker Build

`docker build -t mvn-sample-app .`

## Docker Run

`docker run --name mvn-sample-app -p 8080:8080 mvn-sample-app`
