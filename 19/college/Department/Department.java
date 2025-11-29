package college.Department;
import college.Student;
public class Department{
public void acessS(){
Student s = new Student();
System.out.println("Accessing from department (subpackage not subclass)");
System.out.println("Roll Number : "+s.rollNumber);
//System.out.println("Name : "+name);
//System.out.println("Age "+age);
//System.out.println("CGPA : "+cgpa);
}}

