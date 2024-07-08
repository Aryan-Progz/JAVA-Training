import java.util.Scanner;
class Result {
    public static void main(String[] args) {
        int n1,n2,n3;
        System.out.println("Enter Marks:");
        Scanner sc= new Scanner(System.in);
        n1= sc.nextInt();  
        n2= sc.nextInt();
        n3= sc.nextInt();
        if (n1<45 || n2<45 || n3<45) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
