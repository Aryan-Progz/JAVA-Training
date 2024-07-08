import java.util.*;
public class Digsum {
    public static void main(String[] args) {
        int no,rem, sum=0;
        System.out.println("Enter a no.=");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while (no>0) {
            rem=no%10;
            sum=sum+rem;
            no=no/10;    
        }
        System.out.println(sum);
    }
}