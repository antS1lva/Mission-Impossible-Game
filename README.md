# IMF Mission Simulator

## 📚 Overview

This repository contains a project created for the **Data Structures** course. It simulates missions for the **Improbable Mission Force (IMF)**, designed to help the agent **Tó Cruz** plan and execute operations. The game allows mission planning by simulating scenarios in dangerous buildings filled with enemies, using various items, and aiming to complete objectives such as rescuing hostages or disarming weapons.

The project consists of:
- A game (`ED_GAME`): Includes gameplay features like menus and mission simulations.
- An API (`ED_GAME_API`): Implements core functionality, algorithms, and data management for the game.

The simulation uses **custom-built data structures** from [Java-Custom-Data-Structures](https://github.com/antS1lva/Java-Custom-Data-Structures), enhancing its performance and adaptability.

---

## 📂 Folder Structure

- **`ED_GAME`**: Contains the main gameplay logic and user interface elements. This folder includes features like:
  - Navigating the game menus.
  - Running manual and automatic mission simulations.
  - Displaying mission results and maps.

- **`ED_GAME_API`**: Implements the backend logic required for the game to work, including:
  - Algorithms for managing the building map and simulating agent actions.
  - Handling enemy movements and interactions with items.
  - Core game mechanics like combat, mission success/failure conditions, and score tracking.

- **`IMF`**: Stores additional resources and documentation for the IMF missions.

---

## 🚀 Features

- **Mission Simulator**: Load JSON mission files to simulate various mission scenarios in dangerous buildings.
- **Manual and Automatic Modes**:
  - Manual: Players decide the agent's moves and strategies.
  - Automatic: Calculates the optimal path for completing the mission with maximum health.
- **Custom Data Structures**: Utilizes handcrafted structures like graphs, queues, and stacks for:
  - Representing building maps and connections.
  - Managing enemy behavior and game logic.
  - Handling player items and actions.

---

## 📑 Project Details

This project adheres to the following requirements:
1. Missions are loaded from a JSON file, detailing the building's structure, enemies, items, and objectives.
2. Tó Cruz's actions are simulated turn by turn, with enemy movements occurring after each player action.
3. The game evaluates mission success based on:
   - Completing objectives.
   - Safely exiting the building.
   - Retaining health points above zero.
4. Both manual and automatic simulation results are exportable in JSON format for briefing purposes.

---

## 💻 Development Environment

This project was developed using:
- **Java** as the programming language.
- **IntelliJ IDEA** for coding and testing.
- **Custom data structures** from the [Java-Custom-Data-Structures repository](https://github.com/antS1lva/Java-Custom-Data-Structures).

All code is documented with JavaDoc and follows Java conventions.

---

## 🎯 Purpose

The goal of this project was to:
1. Demonstrate a practical application of **custom data structures**.
2. Build a complex simulation with efficient algorithms.
3. Provide an engaging and educational tool for practicing data structures and algorithm design.
