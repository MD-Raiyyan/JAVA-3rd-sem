package Staff;
import java.util.Scanner;
import java.util.InputMismatchException;
public class staff{
    String id,name,desig;
    String[] Subjects;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Staff if : ");
        id = sc.nextLine();
        System.out.println("staff name : ");
        name = sc.nextLine();
        System.out.println("Designation : ");
        desig = sc.nextLine();int n=0;
        System.out.println("number of subjects :");
        n = sc.nextInt();sc.nextLine();
        
        
        Subjects = new String[n];
        for (int i =0 ; i<n; i++ ){
            System.out.println(" Enter the "+(i+1)+" Subject");
            Subjects[i] = sc.nextLine();
        }
    }
    public void display(){
        System.out.printf("Staff : %s ,id : %s ,designation : %s , subjects :\n",name,id,desig);
        for (String s : Subjects){
            System.out.println(s+", ");
        }
    }
}