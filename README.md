# User Regulation Factory Method Project

This project is a study on the application of the Factory Method design pattern in Java. It demonstrates how to use factory methods to create instances of user regulation classes based on different countries' regulations.

## Project Structure

The project is organized into the following packages:

- `main.java.com.exemple.withfactory`: Contains the main application classes using the Factory Method pattern.
- `main.java.com.exemple.withfactory.factories`: Contains the factory classes responsible for creating user regulation instances.
- `main.java.com.exemple.withfactory.regulations`: Contains the user regulation classes implementing the `UserRegulation` interface.
- `main.java.com.exemple.withfactory.data`: Contains the `User` class representing user data.


- `main.java.com.exemple.nocfactory`: Contains the main application classes without using the Factory Method pattern.
- `main.java.com.exemple.nocfactory.regulations`: Contains the user regulation classes implementing the `UserRegulation` interface.

## Classes

### `User`

Represents a user with basic information such as name, CPF, and email.

### `UserRegulation`

An interface defining the method `isRegulatedUser` to check if a user meets the regulation criteria.

### `MlbUserRegulation`

Implements the `UserRegulation` interface for MLB regulations.

### `MlbRegulationFactory`

A factory class extending `RegulationFactory` to create instances of `MlbUserRegulation`.

### `UserAccountManager` (with factory)

The main class that uses the factory to create user regulation instances and checks if a user is regulated.

### `UserAccountManager` (without factory)

The main class that directly creates user regulation instances and checks if a user is regulated.

## Usage

To run the project with the Factory Method pattern, execute the `UserAccountManager` class in the `withfactory` package. It will create a user and check if the user meets the MLB regulations.

```sh
javac -d out src/main/java/com/exemple/withfactory/*.java src/main/java/com/exemple/withfactory/factories/*.java src/main/java/com/exemple/withfactory/regulations/*.java src/main/java/com/exemple/withfactory/data/*.java
java -cp out main.java.com.exemple.withfactory.UserAccountManager
```

To run the project without the Factory Method pattern, execute the `UserAccountManager` class in the `nocfactory` package. It will create a user and check if the user meets the MLB regulations.

```sh
javac -d out src/main/java/com/exemple/nocfactory/*.java src/main/java/com/exemple/nocfactory/regulations/*.java
java -cp out main.java.com.exemple.nocfactory.UserAccountManager
```

## Example Output

```
User Duda is valid: true
```

## Conclusion

This project demonstrates the use of the Factory Method pattern to create instances of user regulation classes based on different criteria. It helps in understanding how to decouple the creation of objects from their usage, promoting flexibility and scalability in the codebase. Additionally, it provides a comparison with a scenario where the Factory Method pattern is not used, highlighting the benefits of using design patterns in software development.