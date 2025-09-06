# SOLID Principles Cheat Sheet

This provides a **complete understanding of SOLID principles** with definitions, real-world analogies, code examples (Java)

---

## 1️⃣ Single Responsibility Principle (SRP)

**Definition:** A class should have only one reason to change (one responsibility).

**Analogy:** A chef cooks, a waiter serves; combining them reduces efficiency.



## 2️⃣ Open/Closed Principle (OCP)

**Definition:** Software entities should be open for extension but closed for modification.

**Analogy:** A plug socket supports new devices without changing the socket.


## 3️⃣ Liskov Substitution Principle (LSP)

**Definition:** Subtypes must be substitutable for their base types.

**Analogy:** A square cannot always replace a rectangle if it breaks rules.


## 4️⃣ Interface Segregation Principle (ISP)

**Definition:** Clients should not be forced to implement interfaces they do not use.

**Analogy:** A printer shouldn’t implement scan() if it can only print.


## 5️⃣ Dependency Inversion Principle (DIP)

**Definition:** High-level modules should not depend on low-level modules. Both should depend on abstractions.

**Analogy:** A driver depends on a vehicle interface, not a specific car model.


**Summary Table:**

| Principle | Meaning                                     | Example                                   |
| --------- | ------------------------------------------- | ----------------------------------------- |
| SRP       | One class, one responsibility               | UserRepository, ReportGenerator           |
| OCP       | Open for extension, closed for modification | PaymentProcessor + Payment interface      |
| LSP       | Subtypes must be substitutable              | Sparrow & Ostrich example                 |
| ISP       | Small, specific interfaces                  | Printer & Scanner interfaces              |
| DIP       | Depend on abstractions, not concrete        | UserService depends on Database interface |

---

This can be used as a **quick reference and interview cheat sheet** for SOLID principles.
