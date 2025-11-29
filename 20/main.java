import Staff.staff;
import Student.student;
public class main{
    public static void main(String[] args){
        student s = new student();
        staff st = new staff();
        System.out.println("Enter he Student details :\n");
        s.input();
        System.out.println("Enter the staff details :\n");
        st.input(); System.out.println("Displaying details :\n");
        s.display();
        st.display();
    }
}