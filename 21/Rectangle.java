import java.util.Scanner;

public class Rectangle implements Resizable{
    private int width, height;
    Scanner sc = new Scanner(System.in);
    public Rectangle(int w,int h){
        width = w;
        height = h;
    }
    public void resizeWidth(int w){
        width = w;
        System.out.println("The widht resized to :"+w);
    }
    public void resizeHeight(int h){
        height = h;
        System.out.println("the height resized to :"+h);
    }
    void display(){
        System.out.println("Rectangle width and height :"+width+" "+height);
    }
}