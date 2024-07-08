import java.util.*;
public class Mulsum {
    public static void main(String[] args) {
        int no,rem, mul=1;
        System.out.println("Enter a no.=");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while (no>0) {
            rem=no%10;
            mul=mul*rem;
            no=no/10;    
        }
        System.out.println(mul);
    }
}
