# 💥 Homework 💥



## 📖 Overview

This project demonstrates:
- **Proxy Pattern**:
  - **Lazy Loading**: Thumbnails load in a flash, and full images are brought in only when needed.
  - **Access Control**: Only authorized users can modify images. Safety first! 🔐

- **Flyweight Pattern**:
  - **Memory Efficiency**: Thousands of map markers use just a few unique marker styles to save memory.
  - **Logging**: Tracks the total number of markers and the count of unique styles to show off the savings.

---

## 🌟 Features

- **Lazy Image Loading**: Get instant thumbnails; full images load on demand.
- **Access Control**: Only VIPs (authorized users) can upload or replace images.
- **Memory Efficiency**: Reuse marker styles to reduce system overhead.
- **Logging**: Monitor marker counts and unique styles – because data is king.

---
here is my link for the UML diagram:https://www.plantuml.com/plantuml/png/hP71Ri8m38RlVOeSYzQ-0KASa7P0ciPUm0JJHNFIAd4bectlFfQimLHSqEZ9SUpl__zq7HWyZvOgunZz4JIgPmiTgizAdRydTJ1X88XlxwFTEp1KBwulDYDHsZXVV5UL9WX1lI9GnXWx45fq7AwuhTgnDwvJHqFem6A6NXRhsVtYFtPIuyNtftYVdrO4yLELzGJpGLQppFAh5QgYAGIdM5iOjk0_q9SGnh4wYJh-rNbinv5G1OuqXIY4EcqsUQcP7iFetfM3xgdtvKImHqh0MIhnxbAsM1JegIFuiYL5RZ8teBdtiQ030nlz6sgP0OsSNkNa8Tijmy9YXvoA-fxuAUxbJxJjIZAh6tRd8sjqXz7I3m00
## 🗂 Project Structure

```plaintext


└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │                   ├── flyweight/       // Flyweight pattern
    │                   │   ├── MapMarker.java
    │                   │   ├── MarkerStyle.java
    │                   │   └── MarkerStyleFactory.java
    │                   ├── model/           // Models
    │                   │   └── User.java
    │                   ├── proxy/           // Proxy pattern
    │                   │   ├── Image.java
    │                   │   ├── ImageProxy.java
    │                   │   ├── ProtectedImageProxy.java
    │                   │   └── RealImage.java
    │                   └── HomeworkDemo.java // Combined demo class
🔧 SOLID Principles
Our project stands on a rock-solid foundation:

SRP (Single Responsibility Principle):
Each class is laser-focused on a single task. For instance, MarkerStyle manages styling, while MarkerStyleFactory handles caching.

OCP (Open/Closed Principle):
The code is extendable without breaking what's already there. New features? Just add them via inheritance or interfaces.

LSP (Liskov Substitution Principle):
Any class implementing the Image interface can replace another without causing a meltdown.

ISP (Interface Segregation Principle):
Interfaces are kept lean and mean – only the necessary methods are included.

DIP (Dependency Inversion Principle):
High-level modules depend on abstractions, making testing and future enhancements super smooth.
