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
| Explanation | 20/100 |
| Database Design | 0/100 |
| Architecture Diagram | 0/100 |
| Overall (Total) | 43/100 |

## Summary

The candidate demonstrates a good understanding of object-oriented programming principles and has designed a functional parking lot system, but their written explanation and database design are not relevant to the problem, and their architecture diagram is not readable. To improve, the candidate should focus on providing clear and relevant explanations of their design decisions and ensuring that all aspects of their submission are relevant to the problem at hand.

## Strengths

- The candidate's ParkingLot class effectively encapsulates the parking lot's state and behavior, including adding spots, parking vehicles, and displaying free spots.
- The VehicleType enum and Vehicle class provide a clear and extensible way to represent different types of vehicles.
- The ParkingSpot class has a clear responsibility for managing its own state, including whether it is occupied and whether a given vehicle can fit in it.

## Where to Improve

- The candidate's written explanation does not clearly explain their approach to the parking lot problem, instead focusing on general lessons learned from software development.
- The database design provided does not appear to be relevant to the parking lot problem, instead seeming to be a design for a URL shortening service.
- The architecture diagram is not readable, and the lack of text labels makes it difficult to understand the candidate's design decisions.
- The candidate's ParkingLot class is responsible for both managing the parking lot's state and calculating the fee for a vehicle's stay, which could be separated into different classes for better extensibility and maintainability.
- The candidate's code does not handle the case where a vehicle tries to leave without a valid ticket, which could lead to errors or unexpected behavior.