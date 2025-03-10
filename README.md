**Advanced Creational Patterns – Builder & Prototype** 

*📌 About the Project*

This project demonstrates the use of Builder and Prototype patterns in the context of a MUD (Multi-User Dungeon) game.

Builder Pattern: Helps construct complex objects step by step (e.g., Dungeon).

Prototype Pattern: Allows efficient object cloning (e.g., Room and NPC).


*The project includes the following tasks:*

Builder — Used to construct a Dungeon object.

Prototype — Implemented to clone rooms (Room) and characters (NPC).

Builder + Prototype — Combining both patterns to create and modify objects dynamically.


*📂 Project Structure*

Solution-Homework-3/

│── src/

│   ├── main/

│   │   ├── java/

│   │   │   ├── org/example/

│   │   │   │   ├── builder/

│   │   │   │   │   ├── IDungeonBuilder.java

│   │   │   │   │   ├── SimpleDungeonBuilder.java

│   │   │   │   ├── prototype/

│   │   │   │   │   ├── CloneableGameEntity.java

│   │   │   │   │   ├── Room.java

│   │   │   │   │   ├── NPC.java

│   │   │   │   ├── models/

│   │   │   │   │   ├── Dungeon.java

│   │   │   │   ├── demo/

│   │   │   │   │   ├── Main.java

│   │   │   │   │   ├── MUDBuilderDemo.java /* Task-1*/

│   │   │   │   │   ├── MUDPrototypeDemo.java /* Task-2*/

│   │   │   │   │   ├── MUDCombinedDemo.java /* Task-3*/

│── pom.xml

│── README.md   
