# Springboot-Docker
Writing docker file to push and pull the images
##### Develop ->Build ->Deploy
##### Code -> jar/.war ->Place in server and run
##### Deployment => it is a process of setting all required softwares and starting application under one runtime environment,
#### Runtime Environment is operating system(OS)/Plateform Dependent,
<pre>
1. it means softwares Required to run our application are fully OS Dependent.
2. Example :Java S/W servers like Tomcate/Databases MySql,PostGreSQL
</pre>
<pre>
#### Our application is working fine in DevMachine(ex: Platform is windows), May or may not work properly in other platform(ex: Linux,Mac...etc).
1. so solution is : DO NOT RUN OUR APPLICATION/SERVICES on DIRECT OS(Win/Linux/Mac..)
2.  use virtual Platform that supports to run application any where
3.  (no version or no installer modification required)
4.  Above virtual platform concept if we use, then what exactly running in our Dev Machine will same work in QA,UAT,Production (Even Cloud AWS,PCF,.....etc)
</pre>
### Docker :
<pre>
1. Platform (Virtul OS)
2. it makes our application/services makes os independent
3. Our application /services must present in image format
4. Here Image/docker Image is like executable file for a docker OS
5. Code/JAR       -> IMAGE
6. Tomcate server -> IMAGE
7. MySQL SERVER   -> IMAGE
8. Docker Container -Executing all required images in docker, then one runtime setup is created which is called as container
9. Once Docker image is created then we are going to place our image inside DockerHub
10. (hub.Docker.com) by using ACTIONS like PUSH and PULL
 </pre>
#### Process to start
<pre>
1. create one Account in DockerHub(Register and Login) https://hub.docker.com/
2. write on spring boot application
3. create Doocker File in our application
4. Download and install docker s/w in our system
</pre>























 
