package elevateLabs_task_2;

import java.util.List;
import java.util.Scanner;

public class StudentManager_MainAPP {

	public static void main(String[] args) throws StudentCrud.StudentNotFoundException {
		StudentCrud svc = new StudentCrud();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("\n ***** Student Management Menu ******");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Search Student by ID");
			System.out.println("6. Exit");
			System.out.println("Enter choice to perform: ");
			
			if(!sc.hasNextInt()) {
				System.out.println("Invaild input - please enter a number.");
				sc.next();
				continue;
			}
			
			choice = sc.nextInt();
			sc.nextLine();
			
			try {
				switch(choice) {
				case 1 : {
					System.out.println("Enter Student ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Student Marks: ");
					double marks = sc.nextDouble();
					svc.addStudent(new Student(id, name, marks));
					System.out.println("Student added successfully.");
					break;
				}
				case 2 : {
					List<Student> list = svc.viewAll();
					if(list.isEmpty()) {
						System.out.println("No student records found.");
					}else {
						list.forEach(System.out::println);
					}
					break;
				}
				case 3 : {
					System.out.println("Enter student ID to update: ");
					int uid = sc.nextInt(); sc.nextLine();
					//check existence first
					svc.searchById(uid);
					System.out.println("Enter new Name: ");
					String newName = sc.nextLine();
					System.out.println("Enter new Marks: ");
					double newMarks = sc.nextDouble(); sc.nextLine();
					svc.updateStudent(uid, newName, newMarks);
					System.out.println("Student updated successfully.");
					break;
				}
				case 4 : {
					System.out.println("Enter student ID to delete: ");
					int did = sc.nextInt(); sc.nextLine();
					svc.deleteStudent(did);
					System.out.println("Student deleted successfully.");
					break;
				}
				case 5 : {
					System.out.println("Enter Student ID to search: ");
					int sid = sc.nextInt(); sc.nextLine();
					Student s = svc.searchById(sid);
					System.out.println("Found: " + s );
					break;
				}
				case 6 :
					System.out.println("Exiting...");
					break;
				default : 
					System.out.println("Invalid choice.please enter 1-6.");
					break;
				}
			}catch(IllegalArgumentException e) {
				System.out.println("Error: "+ e.getMessage());
			}
		} while(choice != 6);
		
         sc.close();
	}

}
