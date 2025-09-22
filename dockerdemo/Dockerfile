#User OpeJdk base Image
FROM openjdk:17

#Set working director inside the container
WORKDIR /app

# copy java source code
COPY Hello.java .

#Compile the java program
RUN javac Hello.java

#Run the Java program
CMD ["java","Hello"]