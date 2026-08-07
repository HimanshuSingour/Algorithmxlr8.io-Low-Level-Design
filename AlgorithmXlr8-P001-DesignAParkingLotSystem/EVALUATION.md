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

The candidate has demonstrated a good understanding of the problem requirements and has implemented a functional parking lot system, but there are areas for improvement, particularly in terms of extensibility, separation of concerns, and database design. The candidate should focus on designing a more flexible and scalable system that meets the non-functional requirements.

## Strengths

- The candidate has successfully implemented the `ParkingSpot` class with a `canFit` method that checks if a vehicle can fit in a particular spot, demonstrating a good understanding of the problem requirements.
- The `Ticket` class is well-designed, storing the vehicle, parking spot, and entry time, which is used to calculate the fee when the vehicle leaves.
- The `ParkingLot` class has a clear and simple `addSpot` method for adding new parking spots, and the `display` method provides a useful summary of the current state of the parking lot.

## Where to Improve

- The candidate should consider adding more vehicle types and spot sizes without modifying the existing code, as per the non-functional requirements. This could be achieved by using a more flexible data structure, such as a dictionary or a separate class for vehicle types.
- The pricing rules are currently hardcoded in the `leave` method of the `ParkingLot` class. It would be better to separate this logic into a separate class or method to make it easier to modify or extend in the future.
- The database design provided does not match the problem requirements. The candidate should design a database schema that includes tables for parking spots, vehicles, and tickets, with relationships between them.
- The `park` method in the `ParkingLot` class does not handle the case where no spot is available. It would be better to throw an exception or return a specific error message in this case, rather than simply printing a message and returning null.