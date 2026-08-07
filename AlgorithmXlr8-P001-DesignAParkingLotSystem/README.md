<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io — LLD Lab</h3>
<p align="center"><sub>Designed and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Design a Parking Lot System

## Overview

You're building the parking system for a mall with a few floors. Bikes, cars, and buses all need somewhere to park, and each vehicle needs a spot sized for it. When a vehicle pulls in, it should be sent to the closest free spot that fits. When it leaves, the system needs to work out how much the driver owes, based on how long they were parked and what they were driving.

## Functional Requirements

- Let a vehicle park in the nearest free spot that fits it
- Let a vehicle leave and free up its spot
- Handle three vehicle types: motorcycles, cars, and buses
- Support several floors, each with its own spots
- Know how many spots are free on each floor at any moment
- Give out a ticket when a vehicle enters, with the entry time and the spot number
- Work out the fee when a vehicle leaves, based on how long it stayed and what type it is
- Show how many spots are free at the entrance of each floor

## Non-Functional Requirements

- It should be easy to add a new vehicle type or spot size later without rewriting what already exists.
- Pricing rules should be able to change without touching the code that assigns spots.
- Floor management, spot assignment, and billing should be separate concerns that do not depend heavily on each other.
- Each class should have one clear job.

---

See `EVALUATION.md` in this folder for the code-review feedback on this design.

See `EXPLANATION.md` for the full write-up of the approach.

See `whiteboard.png` for the architecture whiteboard.