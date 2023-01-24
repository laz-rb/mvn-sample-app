FROM openjdk:19-alpine

ENV ARTIFACT_ID=mvn-sample-app

# Update repo indexes
RUN apk update

# Install packages
RUN apk add shadow bash

# Create Unix user app
RUN useradd -m app

WORKDIR /home/app

COPY target/${ARTIFACT_ID}*.jar ${ARTIFACT_ID}.jar
RUN chown app:app ${ARTIFACT_ID}.jar

USER app

CMD java -jar ${ARTIFACT_ID}.jar
