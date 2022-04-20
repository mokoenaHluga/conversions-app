# conversions-app
Spring Boot application using rest API’s to do a conversions. Fully unit tested, and runs its own Docker 

# To build the app docker image, run the below command
docker build -t conversion-api.jar .

# To confirm that the image is created run the below command, this list all the images that are created.
docker image ls 

# To run your image, use the following command, this is given that you dont have a docker desktop. 
# If you have one, after creating your image, it should automatical appear in the docker desktop

docker run -p 9090:8080 conversion-api.jar
-- Port 9090 is the container port we set when we start our image, will be used to access our app, eg "http://localhost:9090/swagger-ui/#/".
