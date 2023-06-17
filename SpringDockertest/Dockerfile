#FROM <image>
FROM openjdk:8
# Temp Run location
VOLUME /tmp
# Provide Port Information
EXPOSE 8080
#Jar Location to mapping name
ADD build/libs/SpringDockertest-0.0.1-SNAPSHOT.jar SpringDockertest-0.0.1-SNAPSHOT.jar
#Jar Execution command
ENTRYPOINT ["java","-jar","/SpringDockertest-0.0.1-SNAPSHOT.jar"]