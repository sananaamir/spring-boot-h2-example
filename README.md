# Spring Boot Basic H2 Integration

This project is intended for developers starting out with Spring Boot who want to understand how to create a basic REST API with an in memory H2 database. Following are the endpoints for this API:

- Get all Users
- Get User by id
- Add a new User by id
- Update User information by id
- Delete a User by id

### Following is the Schema of the table:

- ID: int
- EMAIL: String
- FIRST_NAME: String
- LAST_NAME: String

### API Endpoints:

- GET all Users: ```<base-url>/users```
- GET User by id: ```<base-url>/users/<id>```
- POST or add new User: ```<base-url>/users/<id>```
- PUT or update a User: ```<base-url>/users/<id>```
- DELETE a User: ```<base-url>/users/<id>```
