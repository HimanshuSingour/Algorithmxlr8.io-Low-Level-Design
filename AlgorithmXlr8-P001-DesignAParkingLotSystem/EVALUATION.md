# Evaluation — Design a Parking Lot System

_Evaluated on 2026-08-15_

## Scores

| Category | Score |
| --- | --- |
| Entities | 80/100 |
| OOP | 70/100 |
| SOLID | 60/100 |
| Design Patterns | 40/100 |
| Extensibility | 50/100 |
| Code Quality | 70/100 |
| Overall (Total) | 62/100 |

## Summary

The candidate's submission demonstrates a good understanding of the problem domain and basic object-oriented principles, but could benefit from further refinement and separation of concerns to improve modularity, maintainability, and extensibility.

## Strengths

- The `ParkingSpot` class has a clear and focused responsibility, encapsulating the state and behavior of a parking spot, including its type and occupancy status.
- The `Vehicle` class is simple and effective, providing a clear representation of a vehicle with its number and type.
- The `Ticket` class is well-designed, capturing the essential information about a vehicle's parking session, including the vehicle, spot, and entry time.
- The `ParkingLot` class provides a basic implementation of a parking lot, allowing vehicles to park and leave, and displaying the number of free spots.

## Where to Improve

- The `ParkingLot` class should be separated into multiple classes, each responsible for a specific concern, such as floor management, spot assignment, and billing, to improve modularity and maintainability.
- The pricing rules should be extracted into a separate class or mechanism, allowing for easier modification and extension without touching the existing code.
- The `ParkingSpot` class should be extended to support multiple floors, with each floor having its own set of spots, to better model the real-world scenario.
- The `VehicleType` enum should be used more consistently throughout the code, avoiding magic numbers and strings, to improve readability and maintainability.
- The `leave` method in the `ParkingLot` class should be improved to handle cases where the ticket is null or invalid, to prevent potential errors and exceptions.