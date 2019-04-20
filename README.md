# Spring-inversion-of-control
Spring inversion of control XML configuration

Setting up the development environment
	1. create an eclipse project
	2.Download the spring jar files
	3. Add the jar to the eclipse project 
Instead of downloading these spring files manually, you can use maven.

Steps for creating a java spring project
1. Make a new java project in eclipse and make a folder lib in the project. then copy the files in the libs folder in the downloaded spring folder. 
2. In the project right click and select the properties -> java build path ->java build path -> libraries -> class path ->Add Jars -> go to the present project and select all the jar files -> OK	 these add the jar files to the class path. You see a new folder in the project named reference libraries


What is inversion of control?
The approach of outsourcing the construction and management of objects to the object factory

Spring container primary functions
1. Create and manage objects (inversion of control)
2. Inject object’s dependency (dependency injection)

Ways of configuring spring container
1. XML configuration (used in legacy application)
2. Java annotation
3. Java source code

Spring development process
1. Configure spring beans
2. Create spring container
3. Retrieve beans from the container
 
Spring containers are also known as ApplicationContext
