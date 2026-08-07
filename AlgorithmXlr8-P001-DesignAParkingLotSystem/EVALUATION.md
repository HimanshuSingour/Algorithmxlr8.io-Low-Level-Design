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
| Code Quality | 80/100 |
| Database Design | 0/100 |
| Overall (Total) | 54/100 |

## Summary

The candidate has demonstrated a good understanding of object-oriented programming principles and has designed a functional parking lot system, but the database design is completely off-topic and the code could benefit from further modularization and separation of concerns.

## Strengths

- The `ParkingSpot` class has a clear and focused responsibility, encapsulating the state and behavior of a parking spot.
- The `Vehicle` class is simple and effective, providing a clear representation of a vehicle with its type and number.
- The `Ticket` class is well-designed, capturing the essential information about a vehicle's parking session, including the entry time and spot.
- The `ParkingLot` class provides a straightforward way to manage parking spots and vehicles, with methods for adding spots, parking vehicles, and displaying the number of free spots.

## Where to Improve

- The `ParkingLot` class should be separated into distinct concerns, such as floor management, spot assignment, and billing, to improve modularity and maintainability.
- The pricing rules should be decoupled from the `ParkingLot` class, allowing for easier changes and additions of new pricing rules.
- The `ParkingSpot` class could benefit from an additional method to check if a spot is available for a specific vehicle type, making the `canFit` method more flexible.
- The database design provided does not match the problem requirements, as it seems to be designed for a URL shortening service rather than a parking lot system.
- The `ParkingLot` class should handle the case where a vehicle tries to leave without a valid ticket, throwing an exception or returning an error message.