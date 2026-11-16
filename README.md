# Person HashSet

A Java project that demonstrates how object equality works using the `equals()` and `hashCode()` methods. The program uses a `HashSet` to prevent duplicate people based on their names and ages.

## Technologies

- Java
- HashSet
- Set Interface
- Object-Oriented Programming (OOP)
- `equals()` and `hashCode()`
- Java Objects Utility Class

## Features

- Create `Person` objects with name and age attributes.
- Define object equality by overriding `equals()`.
- Generate consistent hash codes by overriding `hashCode()`.
- Store people in a `HashSet`.
- Prevent duplicate entries based on matching names and ages.
- Display all registered people.
- Show the total number of unique people.
- Explain how `HashSet`, `equals()`, and `hashCode()` work together.

## How It Works

The `Person` class overrides `equals()` to consider two people equal when they have the same name and age.

The `hashCode()` method generates a hash code based on these attributes, ensuring that equal objects return the same hash code.

The `HashSet` uses `hashCode()` to organize and locate elements and `equals()` to check whether objects are duplicates.

As a result, people with matching names and ages are not added more than once.

## How to Run

1. Clone or download this repository.
2. Open the project in your preferred Java IDE.
3. Make sure `Person.java` and `PersonForm.java` are in the same project.
4. Compile and run the `PersonForm` class.
5. Check the console output to see the registered people and the final number of unique objects.

## Project Structure

```text
Person-HashSet/
├── Person.java
├── PersonForm.java
└── README.md
```

## Author

João Sales