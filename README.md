#Publishing Consuming message from topics
Spring Boot and Apache kafka: Publishing and Consuming message from topics
Kafka-Producer: Create producers to publish messages to apache kafka topics
KAfka-Consumer: Create consumers to consume messages from kafka topics
REST-API: to post messages to apache kafka

#Get KAFKA
Download latest release kafka and extract it
$ tar -xzf kafka_2.13-3.0.0.tgz
$ cd kafka_2.13-3.0.0

#Start Zookeper Service
Open terminal and add this command inside kafka path
$ bin/zookeeper-server-start.sh config/zookeeper.properties

#Start Kafka broker Service
Open another terminal and add this command inside kafka path
$ bin/kafka-server-start.sh config/server.properties

#Run Spring Boot application
Run kafkaapp application

#REST-API -to post message to apache kafka
Download POSTMAN 
Use POST method
URL is: http://localhost:8081/kafkaapp/post?msg=First message

In the URL using question mark pass in the param message with the value say 'First message' with succesfull 200 stsus code
Now check in the spring boot application, The producer successfully posted the message to the topic
Consumer picked it from there and printed it

#application.properties 
This file will tell our producer and consumer about location of apache kafka instances
 
#The port where our app will listen to
server.port=8081

#The port where kafka server or bootstrap server running locally
spring.kafka.consumer.bootstrap-servers=localhost:9092
Spring.kafka.producer.bootstrap-servers=localhost:9092

