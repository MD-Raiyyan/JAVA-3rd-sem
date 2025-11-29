class ExDemo{
    public static void makearr(int n) throws NegativeArraySizeException{
        if(n<0){
            throw new NegativeArraySizeException("Size can't be negative :");
        }
        int[] a = new int[n];
        System.out.println("Array of size :"+n);
    }
    public static void main(String[] args){
        try{
            makearr(-5);
            int x = 5/0;
            System.out.println(x);
        }catch(NegativeArraySizeException e){
            System.out.println("caught : "+e);
        }catch(ArithmeticException e){
            System.out.println("caught : "+e);
        }
    }
}