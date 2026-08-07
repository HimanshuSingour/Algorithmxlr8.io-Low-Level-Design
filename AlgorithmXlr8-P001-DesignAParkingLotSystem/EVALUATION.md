# Evaluation — Design a Parking Lot System

_Evaluated on 2026-08-07_

## Scores

| Category | Score |
| --- | --- |
| Entities | 80/100 |
| OOP | 90/100 |
| SOLID | 70/100 |
| Design Patterns | 40/100 |
| Extensibility | 60/100 |
| Code Quality | 85/100 |
| Database Design | 0/100 |
| Overall (Total) | 61/100 |

## Summary

The candidate demonstrates a good understanding of object-oriented programming principles and code organization, but needs to improve on designing a database schema that matches the problem requirements and separating concerns for better modularity and maintainability.

## Strengths

- The candidate has a clear and organized code structure, with each class having a single responsibility, such as the Vehicle class handling vehicle properties and the ParkingSpot class handling spot properties.
- The use of an enum for VehicleType is a good practice, making the code more readable and maintainable.
- The ParkingLot class has a simple and intuitive API for adding spots, parking vehicles, and displaying free spots.

## Where to Improve

- The candidate's database design does not match the problem requirements, as it includes collections for users and URLs, which are not relevant to a parking lot system.
- The ParkingLot class handles both spot assignment and billing, which could be separated into different classes for better modularity and maintainability.
- The leave method in the ParkingLot class calculates the fee based on the vehicle type, which could be extracted into a separate class or method for easier modification and extension.
- The candidate could consider adding more validation and error handling, such as checking for null or invalid input, to make the code more robust.