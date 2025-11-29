class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String msg){
        super(msg);
    }
}
class divbyzero{
    static int div(int a, int b) throws DivisionByZeroException{
        if(b == 0){
            throw new DivisionByZeroException("cannot divid by zero : ");
        }
        return a/b;
    }
    public static void main(String[] args){
        try{int a=23; int b = 0;
            System.out.println("Result : "+div(a,b));
        }catch(DivisionByZeroException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}