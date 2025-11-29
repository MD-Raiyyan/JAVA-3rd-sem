package Student;
import java.util.Scanner;
public class student{
    public String USN,dept;
    int[] Grades = new int[3];
    double SGPA;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USN of the student : ");
        USN = sc.nextLine();
        System.out.println("Enter the name of the Department : " );
        dept = sc.nextLine();
        System.out.println("Enter 3 subjects : ");
        for (int i = 0 ; i <3 ;i++){
            Grades[i] = sc.nextInt();
        }
        SGPA = (Grades[0]+Grades[1]+Grades[2])/3;
    } 
    public void display(){
        System.out.printf("Student : %s Dept : %s , Grades : %d\t%d\t%d ,SGPA : %2f\n",USN,dept,Grades[0],Grades[1],Grades[2],SGPA);
    }
}