FROM  java:8 

# Install maven
RUN rm /etc/apt/sources.list.d/jessie-backports.list
RUN apt-key adv --keyserver keyserver.ubuntu.com --recv-keys AA8E81B4331F7F50
RUN apt-get update  
RUN apt-get install -y maven

# Adding prometheusa-app to container
ADD . /usr/prometheus  
WORKDIR /usr/prometheus
ARG MAVEN_OPTS
RUN ["mvn", "package"]

EXPOSE 8080 
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "target/prometheus-app-0.0.1-SNAPSHOT.jar"]
