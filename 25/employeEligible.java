import java.util.Scanner;
class TooOlder extends Exception{
    public TooOlder(String msg){
        super(msg);
    }
}
class TooYounger extends Exception{
    public TooYounger(String msg){
        super(msg);
    }
}

class employeEligible{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee : ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the employee");
        int age = sc.nextInt();
        
        try{
        if(age>45){
            throw new TooOlder("Employee to old !" );
        }else if(age<18){
            throw new TooYounger("Employee to young !");

        }else{
            System.out.println("Employee is eligible ,emp name :"+ name);

        }
        }catch(TooOlder e){
            System.out.println("Caught :"+e.getMessage());
        }catch(TooYounger e){
            System.out.println("Caught :"+e.getMessage());
        }finally{
            System.out.println("Emplyee is according to its createria");
        }
    }
}