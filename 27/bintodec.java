import java.util.Scanner;
class WrongNumberFormat extends Exception{
    public WrongNumberFormat(String s){
        super(s);
    }
}
class bintodec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binaru number : \n");
        String n = sc.nextLine();
        try{
            if(!n.matches("[01]+")){throw new WrongNumberFormat("input number is not binary ! :");}
            int dec = Integer.parseInt(n,2);
            System.out.println("The decimal number is : "+dec);

        }catch(WrongNumberFormat e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}