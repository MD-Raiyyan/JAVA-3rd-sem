import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Rectangle r =new Rectangle(23 , 23);
        r.display();
        System.out.println("Enter the resizing width :\n");
        int w = sc.nextInt();
        System.out.println("Enter the resizing height :\n");
        int h = sc.nextInt();
        r.resizeWidth(w);
        r.resizeHeight(h);
        r.display();
    }
}