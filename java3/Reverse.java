import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int n,rev=0,rem;
        System.out.println("Enter a no. to Reverse:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        
        }
        System.out.println("Reverse No. is:"+rev);
    }
}
