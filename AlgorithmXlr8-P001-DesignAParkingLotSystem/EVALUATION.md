# Evaluation — Design a Parking Lot System

_Evaluated on 2026-08-07_

## Scores

| Category | Score |
| --- | --- |
| Entities | 80/100 |
| OOP | 70/100 |
| SOLID | 60/100 |
| Design Patterns | 40/100 |
| Extensibility | 50/100 |
| Code Quality | 60/100 |
| Explanation | 0/100 |
| Database Design | 0/100 |
| Architecture Diagram | 0/100 |
| Overall (Total) | 40/100 |

## Summary

The candidate demonstrates a good understanding of object-oriented programming principles and encapsulation, but needs to improve their ability to clearly explain their design decisions and create a relevant database design and architecture diagram. They should focus on creating a more modular and extensible design, separating concerns, and following the single responsibility principle.

## Strengths

- The candidate's `ParkingLot` class effectively encapsulates the parking lot's state and behavior, including adding spots, parking vehicles, and displaying free spots.
- The `VehicleType` enum is a good example of using an enum to represent a fixed set of distinct values, making the code more readable and maintainable.
- The `ParkingSpot` class has a clear and single responsibility, managing its own state and behavior, such as checking if a vehicle can fit and parking/leaving a vehicle.

## Where to Improve

- The candidate's written explanation does not clearly justify the approach, trade-offs, and how it meets the requirements of the parking lot system problem. It seems to be a general reflection on their experience with software engineering.
- The database design provided does not match the problem statement, as it includes collections for `users` and `url`, which are not relevant to a parking lot system.
- The architecture/whiteboard diagram is not readable, and the lack of text labels makes it difficult to understand the design.
- The `ParkingLot` class has a method `leave` that calculates the fee, which could be separated into its own class or method to follow the single responsibility principle.
- The candidate could improve the code quality by adding more comments, using more descriptive variable names, and considering edge cases, such as handling multiple floors and different pricing rules.