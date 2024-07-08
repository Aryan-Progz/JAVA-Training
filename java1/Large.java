import java.util.Scanner;
class Large {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5;
        int max;
        System.out.println("Enter 5 values:");
        Scanner sc= new Scanner(System.in);
        n1= sc.nextInt();  
        n2= sc.nextInt();
        n3= sc.nextInt();
        n4= sc.nextInt();
        n5= sc.nextInt();
        max = n1;
        if(max<n2){
            max=n2;
        }
        if(max<n3){
            max=n3;
        }
        if(max<n4){
            max=n4;
        }
        if(max<n5){
            max=n5;
        }
        System.out.println(max);
    }

}
