Sure! Here's an example README file for your project:

# WeatherApp

WeatherApp is a web application that provides weather forecasts for different cities.
## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) version 20.0.1 or higher
- Maven 3.9.2 (for building the project)

## Getting Started

1. Download the project ZIP file and extract its contents to a directory of your choice.

2. Open a terminal or command prompt and navigate to the root directory of the project.

3. Build the project using the following command:

   ```shell
   mvn clean install
   ```

4. After a successful build, you can start the application using the following command:

   ```shell
    mvn spring-boot:run
   ```

5. Once the application is running, you can access it through your web browser at `http://localhost:8080`.
You can also use the application "Postman", for which a collection of requests have been provided.

## Usage

- **Saving a Weather Forecast**

  To save a weather forecast for a specific city, send a POST request to `/forecasts/{city}` endpoint. For example:

  ```shell
  curl -X POST http://localhost:8080/forecasts/London
  ```

- **Getting a Weather Forecast**

  To retrieve a weather forecast for a specific city, send a GET request to `/forecasts/{city}` endpoint. For example:

  ```shell
  curl -X GET http://localhost:8080/forecasts/London
  ```

- **Getting All Weather Forecasts**

  To get all the saved weather forecasts, send a GET request to `/forecasts/` endpoint. For example:

  ```shell
  curl -X GET http://localhost:8080/forecasts/
  ```
