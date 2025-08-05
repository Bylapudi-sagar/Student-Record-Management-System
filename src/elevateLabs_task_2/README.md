# Student Record Management System

This is a **Java console-based application** that allows users to perform basic CRUD operations on student records. It uses Java collections and follows OOP principles to manage the data efficiently.

---

## ✅ Features

- Add a new student with ID, name, and marks
- View all students
- Update student details
- Delete a student
- Search student by ID
- Menu-driven CLI interface

---

## 💻 Technologies Used

- Java
- Eclipse IDE (can also run in IntelliJ, VS Code, or terminal)
- Java Collections (`ArrayList`)
- Exception Handling
- Scanner for user input

---

## 📦 Project Structure

├── Student.java                 # POJO class for Student entity
├── StudentCrud.java          # Business logic (CRUD operations)
└── StudentManager_MainAPP.java  # Main application with menu loop

## 🚀 How to Run

1.Clone or download this repository.
2.Open the project in your IDE (e.g., Eclipse).
3.Compile and run the file StudentManager_MainAPP.java.

## 🧠 Example Console Output
 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
1
Enter Student ID: 
45
Enter Student Name: 
Kiran
Enter Student Marks: 
90
Student added successfully.

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
5
Enter Student ID to search: 
45
Found: 
 Student [id=45, name=Kiran, marks=90.0]

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
1
Enter Student ID: 
78
Enter Student Name: 
Sagar
Enter Student Marks: 
98
Student added successfully.

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
2

 Student [id=45, name=Kiran, marks=90.0]

 Student [id=78, name=Sagar, marks=98.0]

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
3
Enter student ID to update: 
78
Enter new Name: 
Bylapudi Sagar
Enter new Marks: 
87
Student updated successfully.

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
1
Enter Student ID: 
35
Enter Student Name: 
shyam
Enter Student Marks: 
76
Student added successfully.

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
4
Enter student ID to delete: 
35
Student deleted successfully.

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
2

 Student [id=45, name=Kiran, marks=90.0]

 Student [id=78, name=Bylapudi Sagar, marks=87.0]

 ***** Student Management Menu ******
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Student by ID
6. Exit
Enter choice to perform: 
6
Exiting...

## 📝 Author

Bylapudi Sagar
[Task by Elevate Labs -Internship Selection]

## 📤 Submission

This project was built as part of the [ElevateLabs Java Developer Internship Task].

Submit your GitHub repository link here:
https://github.com/Bylapudi-sagar/Student-Record-Management-System




