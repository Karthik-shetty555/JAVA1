class Q{
int n;
boolean valueSet=false;
synchronized int get()
{
    while(!valueSet)
    try{
        wait();
    }catch(InterruptedException e){
     System.out.println("InterruptedException Caught");
    }
    System.out.println("Got:"+n);
    valueSet=false;
    notify();
    return n;
    }
    synchronized void put(int n)
    {
        while(valueSet)
        try{
            wait();
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception caught");
        }
        this.n=n;
        valueSet=true;
        System.out.println("Put:"+n);
        notify();

    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"producer").start();
}
public void run(){
    int i=0;
        for(i=0;i<10;i++)
        {
        q.put(i++);
    }}
}
class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run(){
            for(int i=0;i<10;i++)
            {
            q.get();
            }
}
    }
public class prg9 {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
}
}
