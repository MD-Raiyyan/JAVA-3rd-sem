package college;
public class Student{
    public int rollNumber;
    protected String name;
    int age;
    private double cgpa ;
    public void display(){
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("CGPA : "+cgpa);
    }
}
