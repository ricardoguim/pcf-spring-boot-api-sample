# My PCF Spring Boot App

This is a sample Spring Boot application that can be deployed to Pivotal Cloud Foundry (PCF). The application provides a REST API for managing `ExampleModel` objects.

## Getting Started

To build and run the application locally, you will need to have Java and Gradle installed on your machine. Once you have those installed, you can run the following commands:

```
gradle build
java -jar build/libs/my-pcf-spring-boot-app.jar
```

This will start the application on `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- `GET /api/examples`: Returns a list of all `ExampleModel` objects.
- `GET /api/examples/{id}`: Returns the `ExampleModel` object with the specified ID.
- `POST /api/examples`: Creates a new `ExampleModel` object.
- `PUT /api/examples/{id}`: Updates the `ExampleModel` object with the specified ID.
- `DELETE /api/examples/{id}`: Deletes the `ExampleModel` object with the specified ID.

## Deployment

To deploy the application to PCF, you will need to have the `cf` CLI installed on your machine and be logged in to your PCF account. Once you have that set up, you can run the following commands:

```
./gradlew build
cf push
```

This will build the application and push it to PCF. The application will be available at the URL provided by PCF.

## Configuration

The application can be configured using the `application.properties` file. The following properties are available:

- `spring.datasource.url`: The URL of the database.
- `spring.datasource.username`: The username for the database.
- `spring.datasource.password`: The password for the database.
- `server.port`: The port on which the application will run.

## Testing

To run the tests for the application, you can run the following command:

```
gradle test
```

This will run all of the tests in the `src/test` directory.