package testapp;
import college.Student;
import college.Department.CSEStudent;
import college.Department.Department;
public class Main{
public static void main(String[] args){
Student s = new Student();
System.out.println("Accessing from main (different package) ");
System.out.println("roll Number :"+s.rollNumber);
s.display();
Department d = new Department();
d.acessS();
CSEStudent cs = new CSEStudent();
cs.accessM();}}
