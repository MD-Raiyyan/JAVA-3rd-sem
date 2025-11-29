package testapp;
import college.Student;
import college.Department.department;
import college.Department.CSEStudent;
class Mainapp{
public static void main(String[] args){
Student s = new Student();
department d = new department();
System.out.println("Accessing from main");
System.out.println("roll Number : "+s.rollNumber);
s.display();
d.accessS();
CSEStudent cs = new CSEStudent();
cs.accessM();
}}
