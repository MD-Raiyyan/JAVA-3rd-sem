class primeTask implements Runnable{
    private int start,end;
    primeTask(int s,int e){start =s;end = e;}
    boolean isprime(int n ){
        if(n<2) return false;
        for (int i =2;i*i<=n;i++){
            if(n%i == 0){return false;}
        }return true;
    }
    public void run(){
        for(int i = start ; i<=end;i++){
            if(isprime(i)){System.out.println(Thread.currentThread().getName()+ ":"+i);}
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        }
    }
}
class primeThreads{
    public static void main(String[] args){
        primeTask p1 = new primeTask(1,50);
        primeTask p2 = new primeTask(100,150);
        Thread th1 = new Thread(p1,"Thread 1 : ");
        Thread th2 = new Thread(p2,"Thread 2 : ");
        th1.start();
        th2.start();
    }
}