This project follows the **Model-View-Controller (MVC)** design pattern. This architectural choice ensures a clean separation of concerns, making the software more scalable, maintainable, and easier to debug.

* **`Model/`**: Manages the core data logic, entity classes (e.g., `Player`), and database or file interactions.
* **`View/`**: Handles the Graphical User Interface (GUI). It presents the data to the user and captures their interactions.
* **`Controller/`**: Acts as the brain of the application. It receives user inputs from the View, processes the business logic, and updates the Model accordingly.

Structure 

<img width="274" height="311" alt="image" src="https://github.com/user-attachments/assets/61b9b290-6911-4cc2-bf04-77757dfef2b8" />


Home & Menu
The central hub of the application. It provides a clean, user-friendly navigation menu that grants quick access to all core functionalities of the player management system.
Home
<img width="1277" height="587" alt="image" src="https://github.com/user-attachments/assets/94b2fe92-8af5-4769-aa51-c1fff6b6b491" />
Menu
<img width="1278" height="586" alt="image" src="https://github.com/user-attachments/assets/17881984-c351-4858-a744-ce41c25bb212" />

Load (Add Player)
An intuitive data entry module designed to register new players into the system. It includes input validation to ensure data integrity and prevent errors before saving the information.
<img width="1277" height="585" alt="image" src="https://github.com/user-attachments/assets/3a2e3019-2caa-48bf-b581-854020012103" />

Modify (Edit Player)
This screen allows the user to select an existing player from the records and update their specific details. All modifications are safely processed through the controller and updated in the data source.
<img width="1279" height="590" alt="image" src="https://github.com/user-attachments/assets/64252474-9b9c-4f65-9cc2-1efa6f24a20a" />

Player List
A comprehensive view displaying all registered players. The data is presented in a structured and organized format (table/grid) for easy reading, sorting, and overall management.
<img width="1274" height="586" alt="image" src="https://github.com/user-attachments/assets/ffd41acc-a4aa-4d19-a31e-2ea4a457b783" />
