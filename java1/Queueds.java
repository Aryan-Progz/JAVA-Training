import java.util.Scanner;
class Queue1{
    int front=0;
    int rear=-1;
    int data;
    int queue[]=new int[10];
    Scanner sc=new Scanner(System.in);
    public void insert(){
        if(front==0 && rear==10){
            System.out.println("Queue overflow");
        }
        else{
            System.out.println("Enter data to insert:");
            data=sc.nextInt();
            queue[rear]=data;
            System.out.println("Element inserted");
            ++rear;
        }
    }
    public void delete(){
        if(front==0 && rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            data= queue[front];
            for(int i=0;i<rear;++i){
                queue[i]=queue[i+1];
            }
            --rear;
            System.out.println("Deleted element is:"+data);
        }
    }
    public void display(){
        if(rear==-1){
            System.out.println("queue is empty");
        }
        else{
            for(int i=0;i<rear;i++){
                System.err.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}

public class Queueds {
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        Queue1 q=new Queue1();
        while(true){
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("5. Enter your choice");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("you have to choose to exit ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter the valid input");
            }
        }    
    }
}
