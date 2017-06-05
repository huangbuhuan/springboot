FROM hbh/jdk8:v1.0
VOLUME /tmp
ENV JAVA_HOME /opt/jdk
ENV PATH $PATH:$JAVA_HOME/bin
ADD spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]