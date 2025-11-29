interface A{
    public void a1();
    public void a2();
}
interface B{
    public void b1();
    public void b2();
}
interface D extends A,B{
    public void d();
}
class base{
    public void bm(){
        System.out.println("base method");
    }
}
class myclass extends base implements D {
    public void a1(){
        System.out.println("Method A1 called");
    }
    public void a2(){
        System.out.println("Method A2 called");
    }
    public void b1(){
        System.out.println("Method B1 called");
    }
    public void b2(){
        System.out.println("Method B2 called");
    }
    public void d(){
        System.out.println("Method D called");
    }
}
class Main{
    public static void UseA(A obj){
        obj.a1();obj.a2();
    }
    public static void UseB(B obj){
        obj.b1();obj.b2();
    }
    public static void UseD(D obj){
        obj.d();
    }
    public static void main(String[] args){
        myclass mb = new myclass();
        System.out.println("calling via interface A");
        UseA(mb);
        System.out.println("calling via interface B");
        UseB(mb);
        System.out.println("calling via interface D");
        UseD(mb);
        System.out.println("calling via base class ");
        mb.bm();
    }
}