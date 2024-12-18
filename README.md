# Logistics System - Low-Level Design in Java  

![Logistics Management System](https://via.placeholder.com/800x300)  

A robust **Logistics Management System** implemented using **Java** with a focus on **Low-Level Design (LLD)** principles. This project demonstrates an organized and scalable approach to solving logistics challenges by incorporating object-oriented programming (OOP), modular design, and real-world logistics workflows such as user registration, delivery management, and admin functionalities.

---


## **Overview**
The **Logistics System** is a Java-based project designed to simulate the core functionalities of a logistics management application. It enables efficient management of users, destinations, delivery personnel, and orders while providing robust admin capabilities.  

The project's main goal is to provide a scalable and maintainable low-level design using core Java concepts such as:
- **Encapsulation**
- **Inheritance**
- **Polymorphism**
- **Collections Framework**

The application showcases practical real-world use cases of low-level design in logistics systems, including:
- Dynamic addition and retrieval of delivery destinations.
- User and admin role-based functionalities.
- Delivery personnel assignment based on destination.

---

## **Features**
### **1. User Functionality**  
- **User Registration**: Register users with essential details such as name, contact, address, and password.  
- **Order Creation**: Users can input weight and distance to create delivery orders.  
- **Delivery Personnel Assignment**: Users are automatically assigned a delivery boy based on their destination.  

### **2. Admin Functionality**  
- **Admin Authentication**: Login functionality to ensure secure access for admins.  
- **Destination Management**:  
  - Display available destinations.  
  - Add new destinations along with associated delivery personnel details (name and contact number).  
- **Delivery Boy Management**: Display all delivery boy details such as names and contact numbers.  
- **Admin Logout**: Securely log out after managing the system.  

### **3. Order Processing**  
- Generate invoices based on user order details.  
- Assign delivery personnel dynamically based on the destination.  

### **4. Modular Design**  
The project is designed using modular OOP principles, ensuring each component (User, Admin, DeliveryBoy, etc.) operates independently, promoting easy maintenance and scalability.  

---

## **Technologies Used**
- **Programming Language**: Java (JDK 8 or higher)  
- **Collections Framework**: For managing data like users, delivery personnel, and destinations.  
- **Scanner Class**: For interactive user input.  
- **OOP Principles**: Encapsulation, inheritance, and polymorphism.  
- **HashMap**: For efficient key-value pair storage (e.g., city and delivery personnel mappings).  

---

## **System Architecture**
### **Class Diagram**
The project adheres to a low-level design with clearly defined classes and methods for each functionality:  
1. **Admin**: Represents admin data and operations.  
2. **AdminDetails**: Manages admin credentials and authentication.  
3. **Users**: Represents user details and functionalities.  
4. **UsersDetails**: Handles user registration and retrieval.  
5. **DeliveryBoy**: Represents individual delivery personnel.  
6. **DeliveryBoyDetails**: Manages delivery personnel and destinations.  
7. **Orders**: Encapsulates order details like weight, distance, and user ID.  
8. **Invoice**: Generates invoices based on order and delivery details.  
9. **Main**: The entry point of the application, implementing the logic for user/admin interaction.

### **Data Flow**  
1. **User Flow**:  
   - Registration → Order Placement → Delivery Assignment → Invoice Generation  

2. **Admin Flow**:  
   - Login → Destination Management → Delivery Personnel Management → Logout  

### **Example Workflow**:
1. A user registers and places an order.  
2. The system assigns a delivery boy based on the destination city.  
3. The admin can add new destinations and delivery personnel as needed.  

---

## **Installation and Setup**
Follow these steps to set up the project on your local machine:

### **1. Prerequisites**  
- Java JDK (8 or higher)  
- IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code with Java plugin)  

### **2. Clone the Repository**
```bash
git clone https://github.com/SaiPavankumar22/Logistics_JAVA_LowLevelDesign.git
cd Logistics_JAVA_LowLevelDesign
```

### **3. Run the Project**
1. Open the project in your preferred IDE.  
2. Compile and run the `Main.java` file.  

---

## **Usage**
### **Running the Application**  
1. Upon starting the application, the user is prompted to choose between **User** or **Admin** functionalities.  
2. Depending on the choice, the user can either register and place an order or manage the system as an admin.  

### **Admin Functionality Example**  
- **Display Available Destinations**  
  ```text
  Available Destinations:
  1. Hyderabad
  2. Vijayawada
  3. Vizag
  ```

- **Add a Destination and DeliveryBoy**  
  ```text
  Enter new City Name: Chennai
  Enter Delivery Boy Name: Karthik
  Enter Contact Number: 9876543210
  Updated Destinations and Delivery Boys:
  Chennai - Karthik - 9876543210
  ```

### **User Workflow Example**  
- Register as a user with basic details.  
- Place an order by entering weight and distance.  
- The system assigns the most relevant delivery personnel and generates an invoice.  

---


## **Contributing**
Contributions are welcome! If you have suggestions for improvements or new features:  
1. Fork the repository.  
2. Create a new branch for your feature (`git checkout -b feature-name`).  
3. Commit your changes (`git commit -m "Add feature"`).  
4. Push to your branch (`git push origin feature-name`).  
5. Open a pull request.  

---

## **License**
This project is licensed under the MIT License. You are free to use, modify, and distribute this project, provided proper credit is given to the original author.  

