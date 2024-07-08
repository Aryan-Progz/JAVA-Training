class Linkedl{
    class GetNode{
        int data;
        GetNode next;
        public GetNode(){
            next= null;
        }
    }
    java.util.Scanner sc= new java.util.Scanner(System.in);
    GetNode head;
    public void append(){
        System.out.println("enter data:");
        int data=sc.nextInt();
        GetNode newNode=new GetNode();
        newNode.data=data;
        if(newNode==null){
            System.out.println("Memory not available");
        }
        else if(head==null){
            head=newNode;

        }
        else{
            GetNode ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }
    }
    public void addAtbeg(){
        System.out.println("enter data:");
        int data=sc.nextInt();
        GetNode newNode=new GetNode();
        newNode.data=data;
        if(newNode==null){
            System.out.println("Memory not available");
        }
        else if(head==null){
            head=newNode;
        }
        else {
            GetNode ptr=head;
            newNode.next=ptr;
            head=newNode;
        }

    }
    public void addAter(){
        System.out.println("enter data:");
        int data=sc.nextInt();
        GetNode newNode=new GetNode();
        newNode.data=data;
        if(newNode==null){
            System.out.println("Memory not available");
        }
    }
    public void display(){
        GetNode ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" --> ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
public class Linkedlistds {
    public static void main(String[] args) {
        Linkedl l=new Linkedl();
        while(true){
            System.out.println("\n1. Append");
            System.out.println("\n2. AddAtBeginning");
            System.out.println("\n3. Display");
            System.out.println("\n4. AddAfter");
            System.out.println("\n5. Exit");
            System.out.println("Enter your choice:");
            int n=new java.util.Scanner(System.in).nextInt();
            switch (n) {
                case 1:l.append();
                       break;
                case 2:l.addAtbeg();
                       break;
                case 3:l.addAter();
                       break;
                case 4:l.display();
                       break;
                case 5:System.exit(0);
            
            }
        }
    }
}
