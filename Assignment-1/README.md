### Design Patterns in Java

This project demonstrates six software design patterns using Java. The examples are divided into three categories: Behavioral, Creational, and Structural patterns, each showcasing two use cases.

## Table of Contents

Observer Pattern - Stock Price Monitor
Strategy Pattern - Payment Processing
Singleton Pattern - Configuration Manager
Factory Pattern - Shape Factory
Adapter Pattern - Payment Gateway Integration
Decorator Pattern - Product Customization


### Observer Pattern - Stock Price Monitor

Description

The Observer Pattern defines a one-to-many dependency between objects where one object changes state and its dependents are notified automatically.
This example simulates a stock price monitor where multiple displays update automatically when stock prices change.

### How to Run

Navigate to the observer directory.
Compile and run ObserverPatternDemo.java.
bashCopycd observer

javac ObserverPatternDemo.java

java ObserverPatternDemo

### Strategy Pattern - Payment Processing

Description

The Strategy Pattern allows selecting an algorithm at runtime. The pattern lets the algorithm vary independently from the clients that use it.
This example showcases different payment strategies (CreditCard, PayPal) to process orders.

### How to Run:

Navigate to the strategy directory.
Compile and run StrategyPatternDemo.java.
bashCopycd strategy

javac StrategyPatternDemo.java

java StrategyPatternDemo

### Singleton Pattern - Configuration Manager

Description

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.
This example implements a ConfigurationManager that holds application-wide settings.

### How to Run

Navigate to the singleton directory.
Compile and run SingletonPatternDemo.java.
bashCopycd singleton

javac SingletonPatternDemo.java
java SingletonPatternDemo

### Factory Pattern - Shape Factory

Description

The Factory Pattern provides a way to create objects without exposing the creation logic to the client.
This example demonstrates a shape factory that can create different shape objects (Circle, Square) based on user input.

How to Run

Navigate to the factory directory.
Compile and run FactoryPatternDemo.java.
bashCopycd factory

javac FactoryPatternDemo.java

java FactoryPatternDemo

### Adapter Pattern - Payment Gateway Integration

Description

The Adapter Pattern allows incompatible interfaces to work together by wrapping an object to fit the expected interface.

This example adapts an old payment system to work with a new payment gateway interface.

How to Run

Navigate to the adapter directory.
Compile and run AdapterPatternDemo.java.
bashCopycd adapter

javac AdapterPatternDemo.java

java AdapterPatternDemo

### Decorator Pattern - Product Customization

Description

The Decorator Pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

This example demonstrates how a Product object can be enhanced with optional features like gift wrapping and custom messages.

How to Run

Navigate to the decorator directory.
Compile and run DecoratorPatternDemo.java.
bashCopycd decorator

javac DecoratorPatternDemo.java

java DecoratorPatternDemo

### Project Structure

Copydesign-patterns/

│

├── observer/

│ ├── Stock.java

│ ├── StockObserver.java

│ ├── ObserverPatternDemo.java

│

├── strategy/

│ ├── PaymentStrategy.java

│ ├── CreditCardPayment.java

│ ├── PayPalPayment.java

│ ├── StrategyPatternDemo.java

│

├── singleton/

│ ├── ConfigurationManager.java

│ ├── SingletonPatternDemo.java

│

├── factory/

│ ├── ShapeFactory.java

│ ├── Circle.java

│ ├── Square.java

│ ├── FactoryPatternDemo.java

│

├── adapter/

│ ├── OldPaymentSystem.java

│ ├── PaymentGateway.java

│ ├── PaymentAdapter.java

│ ├── AdapterPatternDemo.java

│

├── decorator/

│ ├── Product.java

│ ├── BasicProduct.java

│ ├── ProductDecorator.java

│ ├── GiftWrapDecorator.java

│ ├── DecoratorPatternDemo.java

│

└── README.md

### Requirements

Java 8 or higher
