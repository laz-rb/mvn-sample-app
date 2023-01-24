# mvn-sample-app

This is a maven sample application.

## Run

Run the project by `mvn spring-boot:run`

## Package

Package the project by `mvn clean package`

## Docker Build

`docker build -t mvn-sample-app .`

## Docker Run

`docker run --name mvn-sample-app -p 8080:8080 mvn-sample-app`
