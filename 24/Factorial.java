class Factorial{
    static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args){
        try{
            int num = Integer.parseInt(args[0]);
            if (num <0){
                throw new NumberFormatException("number cannot be float : ");

            }
            if (num == 0){
                throw new IllegalArgumentException("the argument cannot be 0 (manual Throw)");
            }
            int fact = factorial(num);
            System.out.println(fact);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("no argu caught : "+e);
        }catch(NumberFormatException e){
            System.out.println("float/double value not allowed caught : "+e);
        }catch(IllegalArgumentException e){
            System.out.println("error : "+e.getMessage());
        }
    }
}
