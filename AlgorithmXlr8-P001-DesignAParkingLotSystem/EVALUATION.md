# Evaluation — Design a Parking Lot System

_Evaluated on 2026-08-08_

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

The candidate has a good start on the parking lot system, but needs to work on breaking down the responsibilities of the `ParkingLot` class and adding support for multiple floors. Additionally, the pricing rules should be extracted into a separate class or method to make it easier to change or extend.

## Strengths

- The `ParkingSpot` class encapsulates the logic for determining if a vehicle can fit in a spot, which is a good application of encapsulation.
- The `Vehicle` class is simple and effectively represents a vehicle with a license number and type.
- The `Ticket` class is well-structured and contains the necessary information for a parking ticket, including the vehicle, spot, and entry time.

## Where to Improve

- The `ParkingLot` class is doing too much work, including parking, leaving, and displaying free spots. Consider breaking this down into separate classes or methods for each responsibility.
- The pricing rules are hardcoded in the `leave` method of the `ParkingLot` class. Consider extracting this into a separate class or method to make it easier to change or extend.
- There is no support for multiple floors in the current implementation. Consider adding a `Floor` class to represent each floor and its associated parking spots.
- The `display` method in the `ParkingLot` class only shows the total number of free spots, but does not provide any information about the number of free spots on each floor. Consider modifying this method to provide more detailed information.