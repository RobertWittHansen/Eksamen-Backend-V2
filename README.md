# dagligvare_levering
-. 3.Semester exam project.

# Explore Rest APIs (also known as Restful API)
The app defines following CRUD APIs.
API = application programming interface.
REST = architectural style.
REST = stands for representational state transfer and allows for interaction with RESTful web services.

# Annotations
Java annotations are metadata (data about data) for our program source code.
They provide additional information about the program to the compiler but are not part of the program itself.
These annotations do not affect the execution of the compiled program.

# JPA
JPA bruger objektet som skabalon til at oprette databasen.
Måden JPA gør dette er et @Entity.
Dette er selve Objektet.
Objektet sikker alt der sker i databasen.

# CRUD
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

## Product
| Method    | Url          | Description | Sample Valid Request Body |
|-----------|--------------|-------------|---------------------------|
| GET       | ("")         | Get all     | List of all Product       |
| GET       | (path/{id})  | Get all     |                           |
| POST      | ("/")        | Create      |                           |
| PUT       | /{id}        | Update      |                           |
| DELETE    | /{id}        | Delete      |                           |
|           |              |             |                           |
| TEST      | Postman      | Ja.         |                           |
| Unit test |              | Nej         |                           |
| Unit test |              | Nej         |                           |
|           |              |             |                           |


## ProductOrder
| Method     | Url          | Description | Sample Valid Request Body |
|------------|--------------|-------------|---------------------------|
| GET        | ("")         | Get all     | List of all               |
| GET        | (path/{ id}) | Get all     |                           |
| POST       | ("/")        | Create      |                           |
| PUT        | /{ id}       | Update      |                           |
| DELETE     | /{id}        | Delete      |                           |
|            |              |             |                           |
| TEST       | Postman      | Ja.         |                           |
| Unit test  |              | Nej         |                           |
| Unit test  |              | Nej         |                           |


## Delivery
| Method     | Url          | Description | Sample Valid Request Body |
|------------|--------------|-------------|---------------------------|
| GET        | ("")         | Get all     | List of all               |
| GET        | (path /{id}) | Get all     |                           |
| POST       | ("/")        | Create      |                           |
| PUT        | ("/{id}")    | Update      |                           |
| DELETE     | ("/{id}")    | Delete      |                           |
|            |              |             |                           |
| TEST       | Postman      | Ja.         |                           |
| Unit test  |              | Nej         |                           |
| Unit test  |              | Nej         |                           |



