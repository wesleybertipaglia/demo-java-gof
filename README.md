# Demo Java GoF Patterns

This project showcases examples of common GoF (Gang of Four) design patterns implemented in Java. The project is organized into three main categories: Creational, Structural, and Behavioral patterns.


## Creational Patterns

Creational design patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

- `Builder.java`

The Builder pattern allows constructing complex objects step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

- `Factory.java`

The Factory pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

- `Singleton.java`

The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

## Structural Patterns

Structural design patterns deal with object composition, aiming to simplify the design by identifying a simple way to realize relationships among entities.

- `Adapter.java`

The Adapter pattern allows objects with incompatible interfaces to work together by wrapping their own interface around that of an already existing class.

- `Decorator.java`

The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

- `Facade.java`

The Facade pattern provides a simplified interface to a complex subsystem, making it easier to use.

## Behavioral Patterns

Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.

- `Observer.java`

The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

- `Strategy.java`

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

- `TemplateMethod.java`

The Template Method pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Contributing

Feel free to fork this project and submit pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.