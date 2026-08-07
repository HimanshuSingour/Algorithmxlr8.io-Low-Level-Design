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
| Overall (Total) | 63/100 |

## Summary

The candidate has a good understanding of object-oriented principles and has designed a clear and focused `ParkingSpot` class, but needs to work on breaking down the `ParkingLot` class into smaller, more manageable pieces and extracting separate classes for pricing rules and floor management.

## Strengths

- The `ParkingSpot` class has a clear and focused responsibility, encapsulating the state and behavior of a single parking spot.
- The `Vehicle` class is simple and effective, providing a clear representation of a vehicle with its type and number.
- The `Ticket` class is well-designed, capturing the essential information about a vehicle's parking session, including the entry time and spot number.

## Where to Improve

- The `ParkingLot` class is doing too much work, including parking, leaving, and displaying free spots. Consider breaking it down into separate classes for each concern.
- The pricing rules are hardcoded in the `leave` method of the `ParkingLot` class. Consider extracting a separate class or interface for pricing rules to make them more flexible and maintainable.
- The `ParkingLot` class does not support multiple floors. Consider adding a `Floor` class to represent a single floor with its own spots.
- The `display` method in the `ParkingLot` class only shows the total number of free spots. Consider adding more detailed information, such as the number of free spots per floor or per spot type.