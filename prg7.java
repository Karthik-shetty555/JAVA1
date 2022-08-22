package java12;

import java.util.Scanner;
class QueueException extends Exception{
    public void Error(){
        System.out.println("There is no elemets");

    }
}

class queue{
    int front=-1;
    int rear;
    int q[];
    queue(int size)
    {
        q=new int[size];
    }
    
    
    void insert(int ele) { 
        if(rear==q.length){
            throw new ArrayIndexOutOfBoundsException(); 
        }
        if(front==-1)
        front=0;
        q[rear++]=ele;

    }
    int delete()throws QueueException{
        int ele;
        if(front==-1){
              throw new QueueException();
        }
        if(front==rear){
            ele=q[front];
            rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;
    }
    void display() {
        
        if(front==-1){
            System.out.println("Queue is empty");

             
         
        }
        else
        {
            for(int i=front;i<rear;front++){
                System.out.println(q[i]+"\t");
            }

        }
    }


}


public class prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Queue size");
        int size=sc.nextInt();
        queue que=new queue(size);
           try{
               while(true)
               {
            System.out.println("\n1.insert\n2.delete\n3.display");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
                    switch(ch)
                    {
                            case 1:System.out.println("Enter element to be inserted");
                                   int a=sc.nextInt();
                                   que.insert(a);
                            break;
                            case 2:System.out.println("The deleted item is:"+que.delete());
                            break;
                            case 3:que.display();
                                   break;
                            default:System.out.println("Please enter valid choice");
                         }
                }

             }
             catch(QueueException e)
             {
                e.Error();
             }
             catch(ArrayIndexOutOfBoundsException e){
                System.out.print("Array out of space");
             }
    }
}
