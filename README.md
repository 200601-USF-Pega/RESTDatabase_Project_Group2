# RESTDatabase_Project_Group2

REST API Activity

The goal of this activity is to make a REST API. You will be assigned to groups, and your job as a group is to:
Design a REST API that makes use of at least two controllers. Be creative!
Design a database to connect your REST API to.
Create DAOs to provide connectivity between your database and your API.

This assignment will be something of an exercise in teamwork. Use your resources and tools to facilitate your work: there are examples on GitHub of everything  you need to know; you already have a database account on ElephantSQL; and you can use Git to divy up the work. Try and figure out how to use Git to work simultaneously on different parts of a project (e.g. database, DAOs, and API all at once). A clear understanding of design goals will help tremendously.

Like your Project 0, your REST API should have database connectivity, but unlike your Project 0, your API does not need a user interface; its use case is limited to requests made via HTTP, and depending on the verb, it should use JSON.

For GET and DELETE requests, you can test your application by just entering the correct URL in your browser’s omnibar and hitting Enter.

For PUT and POST requests, you will have to make a correctly-formatted HTTP request with JSON in the body. This can be achieved via programs like Postman and Boomerang. You are encouraged to explore and find what works for you.



================================================================================================================================================











Ideas:
DMV Line Manager (First name, Last Name, Reason, ticket number)


What we need:
REST API with at least two controllers
Database to connect to the REST API
Create DAOS to provide connectivity
HTML (basic welcome)
Singleton Connection
Service (Servlet?)
Person Bean: firstName, lastName, reason

Folders:
com.revature:
	
Service
	Person Service
		Get: All people
		Post: Add person 
Model

Web
	MyProperties

Dao
		Get All people
		Post Add person


Resources
	


Stretch Goal
Microsoft Power Point, Not google slides!
