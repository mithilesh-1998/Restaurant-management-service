# Restaurant-management-service

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

- Controllers: Handle incoming HTTP requests, validate inputs, and coordinate the flow of data between the client and the service layer.
- Services: Contain the business logic of the application, perform operations on the entities, and interact with the repositories.
- Repositories: Provide the interface to interact with the underlying database.
- Database: Stores the entities and their related data.

## Database Design
The project uses a database to store the entities. The design includes the following entities:

- User: Represents a user with attributes such as id, username, password, and email. Users can have different roles: normal user, viewer, or admin.
- FoodItem: Represents a food item with attributes such as id, title, description, and price. Only admin users can create food items.
- Order: Represents an order with attributes such as id, food item id, quantity, user id, and status. Only normal users can give orders.

## Data Structure Used in the Project
- User: Represents a user with various attributes and associated methods.
- FoodItem: Represents a food item with various attributes and associated methods.
- Order: Represents an order with various attributes and associated methods.
- 
## Sign-in and Sign-up System
The service provides sign-in and sign-up functionality for both admins and users. The credentials are stored securely using MD5 password encryption.

## APIs
The following APIs are available for authentication:
* POST /api/signup/user: Sign up a new user with details like name, email, and password.
* POST /api/signup/admin: Sign up a new admin with details like name, email, and password.
* POST /api/signup/admin: Sign up a new admin with details like name, email, and password.
* POST /api/signin/user: Sign in a user with email and password.
* POST /api/signin/admin: Sign in an admin with email and password.
* POST /api/signout: Sign out the currently authenticated user or admin.

## User Operations
Authenticated users can perform the following operations:

* Place an order: POST /api/orders - Create a new order with order details and items.
* View their order history: GET /api/orders - Retrieve the order history of the authenticated user.

## Admin Operations
Authenticated admins have additional privileges and can perform the following operations:

* Add a new food item: POST /api/fooditems - Create a new food item with details like name, price, etc.
* Update an existing food item: PUT /api/fooditems/{id} - Update the details of a specific food item.
* Delete a food item: DELETE /api/fooditems/{id} - Delete a specific food item.
* View all food items: GET /api/fooditems - Retrieve a list of all available food items.
* Visitor Operations
* Visitors who are not authenticated can perform the following operation:

* View all food items: GET /api/fooditems - Retrieve a list of all available food items.


## Password Encryption
The service uses MD5 password encryption to store user and admin passwords securely. The encryption code can be found in the PasswordEncrypter class.

Please note that this is a simplified example and should be adapted and expanded to fit your specific requirements.

## Project Summary
The Restaurant Management System project is a Spring Boot-based application that provides functionality for managing users, food items, and orders.

The project includes separate controllers for handling CRUD operations on users, food items, and orders. The controllers expose various endpoints to create, read, update, and delete entities.

The application supports different types of users: normal users, viewers, and admin users. Admin users have additional privileges, while viewers have limited access. Normal users can create orders, and only admin users can create food items.
