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
| Code Quality | 70/100 |
| Overall | 65/100 |

## Summary

The candidate has a good understanding of object-oriented programming principles, but needs to work on separating concerns and using design patterns to improve the extensibility and maintainability of the code, particularly in the `ParkingLot` class.

## Strengths

- The `ParkingSpot` class has a clear responsibility and encapsulates its own state and behavior, such as the `canFit` method to determine if a vehicle can fit in the spot.
- The `Vehicle` class is simple and effectively represents a vehicle with its number and type.
- The `Ticket` class is well-structured and holds relevant information about the vehicle and parking spot.
- The `ParkingLot` class has a clear method for adding spots and displaying the number of free spots.

## Where to Improve

- The `ParkingLot` class is doing too much work, including calculating the fee when a vehicle leaves, which should be the responsibility of a separate class, such as a `PricingCalculator`.
- The `leave` method in the `ParkingLot` class should not be responsible for calculating the fee, but rather should focus on updating the state of the parking spot.
- The `ParkingLot` class should be able to handle multiple floors, which is not currently implemented.
- The `display` method in the `ParkingLot` class only displays the total number of free spots, but it would be more useful to display the number of free spots per floor.
- The `VehicleType` enum could be used to determine the pricing rules, rather than using a switch statement in the `leave` method.