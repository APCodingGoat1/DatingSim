# Array of Emotions

## Project Description

DatingSim is a fun and interactive dating simulation game where players can interact with various non-playable characters (NPCs). The game features unique dialogue, character images, and dynamic relationship mechanics.
Users can expect a start game menu, then a character to appear after the start game menu. From there, the user can interact with the character(s) as they see fit.
My game runs realistic relationships with characters

## Features

- **Dynamic NPC Interactions**: Each NPC has unique greetings, dialogue options, and responses.
- **Relationship Mechanics**: NPC relationships change based on the player's choices, tracked through a "love stat."
- **Randomized Character Selection**: Characters are displayed randomly, ensuring a fresh experience each time.
- **Custom GUI**: A visually appealing graphical user interface built with Java Swing.

## How the code works

## How the Code Works

### Main Classes

1. **`Game`**:
   - Serves as the entry point of the application.
   - Initializes the game by creating an instance of `GameGUI`.

2. **`GameGUI`**:
   - Manages the graphical user interface (GUI) of the game.
   - Handles user interactions, such as displaying characters, dialogue, and buttons.

3. **`NPC`**:
   - Represents non-playable characters in the game.
   - Stores data such as the character's name, love stat, and relationship status.
   - Provides methods to modify the love stat and update the relationship status dynamically.

4. **`Dialogue`**:
   - Manages all dialogue-related data, including greetings, "Tell Me More" options, and character images.
   - Provides methods to retrieve and manipulate dialogue data for each NPC.

5. **`customButton`**:
   - A custom class that extends `JButton` to simplify the creation of buttons with specific dimensions, positions, and actions.

---

### Class Interactions

- **`Game`** initializes the game by creating an instance of `GameGUI`.
- **`GameGUI`** interacts with:
  - **`NPC`** to retrieve and update character data (e.g., name, love stat, relationship status).
  - **`Dialogue`** to fetch dialogue options, responses, and character images.
  - **`customButton`** to create interactive buttons for user input.

---

### Data Storage and Usage

- **`ArrayLists`**:
  - Used extensively in the `Dialogue` class to store greetings, dialogue options, responses, and character images.
  - Example: `ArrayList<String[]> greetingsArr` stores greetings for each NPC.

- **Fields in `NPC`**:
  - `name`: Stores the name of the NPC.
  - `loveStat`: Tracks the current love stat of the NPC.
  - `relation`: Represents the relationship status of the NPC, which is dynamically updated based on the `loveStat`.

- **Randomization**:
  - The `Dialogue` class uses a `Random` object to select random greetings or dialogue options for NPCs.

---

### How Inheritance Improves the Design

- **`customButton`**:
  - Inherits from `JButton` to reuse its functionality while adding custom behavior (e.g., setting dimensions and actions).
  - Simplifies button creation and reduces repetitive code in `GameGUI`.

- **Extensibility**:
  - The use of inheritance allows for easy extension of functionality. For example, additional GUI components or NPC behaviors can be added without modifying existing code.

---


## How to Play

1. Launch the game by running the `Game` class.
2. Interact with NPCs by selecting dialogue options.
3. Build or damage relationships based on your choices.
4. Explore all characters and restart the game to play again.

## Author Info

Nathan Diep. Creating even a very simple game(like this one) takes lots of thinking. Also, experimenting with a java GUI was fun