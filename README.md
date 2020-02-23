# Fetch Rewards - Pyramid Word Web Service - Aditya Sawant
### Description: A web service that takes in a string and returns a boolean to indicate whether a word is a pyramid word.  A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing without gaps and without duplicates.
```Examples: Banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.``` 
```Bandana is not a pyramid word because you have 1 'b' and 1 'd'.```


## Instructions
1) Build the project (mvn clean install).
2) Run Application.java which will run the web service and the embedded server.
3) Open a browser or any web service API testing tools and give the following URL as the service endpoint:
```http://localhost:8081/ispyramid?input=<insert-word-of-your-choice>```
4) The result is displayed after hitting the service endpoint.

##About
This project has been developed using Java(1.8) and Spring Boot. 
The REST web service runs on port 8081 and this project also comes with a client (i.e PyramidClient.java) whose getResult() method takes in a string argument and returns true or false based on whether the word is a pyramid word or not.
