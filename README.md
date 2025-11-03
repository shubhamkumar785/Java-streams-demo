# Java-streams-demo

**Exploring the power of Java Stream API through practical and easy-to-understand examples.**

## Table of Contents
1. [About](#about)  
2. [Why use Java Streams?](#why-use-java-streams)  
3. [What this demo covers](#what-this-demo-covers)  
4. [Getting Started](#getting-started)  
5. [Project Structure](#project-structure)  


## About  
This repository contains a set of simple and practical examples that demonstrate how to use the Java Stream API. The goal is to help developers (especially beginners) understand how streams can simplify operations on collections, how they differ from older approaches (loops), and when it makes sense to use them.  

## Why use Java Streams?  
- With the Stream API you can write more **declarative** code (i.e., *what* you want to do) rather than *how* you loop manually.  
- Streams support **functional-style operations** (map, filter, reduce, etc.) which help make code more readable and concise.  
- They can lead to better performance in some scenarios (especially with parallel streams).  
- They help you write code that’s more expressive — once you’re comfortable with them.

## What this demo covers  
In this project you’ll find examples such as:  
- Creating streams from collections, arrays and other data sources.  
- Using intermediate operations (e.g., `filter`, `map`, `flatMap`, `sorted`).  
- Using terminal operations (e.g., `forEach`, `collect`, `reduce`, `min`, `max`, `count`).  
- Working with optional values returned by stream operations.  
- Comparing traditional iterative code vs stream-based code.  
- (Optionally) Introduction to parallel streams.

Each example is designed to highlight a specific concept or use-case in a clear and simple way.

## Getting Started  
### Prerequisites  
- Java Development Kit (JDK) 8 or higher (since streams were introduced in Java 8).  
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).  
- Git (to clone the repo) or you can download the ZIP.

### Installation / Setup  
1. Clone the repository:  
   ```bash
   git clone https://github.com/shubhamkumar785/Java-streams-demo.git
2. Open the project in your IDE.
3. Build the project (depending on how you’ve set it up; if it’s a plain Java project, just compile it).
4. Explore the example classes under Stream API folder (or equivalent) to see how each example is structured.

## Project Structure 🧩
```
Stream API/
└── src/
    └── org.stream.api/
        ├── streamMain1.java
        ├── streamMethod.java
        └── streamObject.java
```
## 🧠 Concepts Covered
1. Creating streams from collections and arrays
2. Intermediate operations: filter(), map(), sorted(), distinct()
3. Terminal operations: forEach(), collect(), reduce(), count()
4. Using Stream.of() and List.of()
5. Handling objects and custom classes with streams
