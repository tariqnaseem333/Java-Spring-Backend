# this base image 
FROM openjdk

# setting work dir
WORKDIR /user/src/mayapp

COPY . /user/src/mayapp/

RUN javac Test.java

#start up executable
CMD ["java","Test"]