package elevateLabs_task_2;

import java.util.*;

public class StudentCrud {
     private List<Student> students = new ArrayList<Student>();
     
     public static class StudentNotFoundException extends Exception {
         public StudentNotFoundException(String msg) { super(msg); }
     }

     public void addStudent(Student s) {
    	 for(Student st : students) {
    		  if(st.getId() == s.getId()) {
    			  throw new IllegalArgumentException("Student Id already exists: "+ s.getId());
    		  }
    	 }
    	 
    	 students.add(s);
     }
     
     public List<Student> viewAll(){
    	 return new ArrayList<Student>(students);
     }
     
     public void updateStudent(int id, String newName, double newMarks) {
    	 for(Student s : students) {
    		 if(s.getId() == id) {
    			 s.setName(newName);
    			 s.setMarks(newMarks);
    			 return;
    		 }
    	 }
    	 throw new NoSuchElementException("No student found with Id " + id);
     }
     
     public void deleteStudent(int id) {
    	 boolean removed = students.removeIf(s -> s.getId() == id);
    	 if(!removed) {
    		 throw new NoSuchElementException("Cannot delete: ID not found " + id);
    	 }
     }
     
     public Student searchById(int id) {
    	 return students.stream()
    			 .filter(s -> s.getId() == id)
    	          .findFirst()
    	          .orElseThrow(() -> new NoSuchElementException("No student with ID "+ id));
     }
}
