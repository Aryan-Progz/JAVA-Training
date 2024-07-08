import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int no, fact=1;
        System.out.println("Enter a no.=");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while (no>0) {
            fact=fact*no;
            --no;    
        }
        System.out.println(fact);
    }
}
