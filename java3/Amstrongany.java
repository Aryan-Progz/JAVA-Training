import java.util.*;
public class Amstrongany {
    public static void main(String[] args) {
        int n,rem;
        double sum=0;
        System.out.println("enter a no.:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int no=n;
        while(n>0){
            rem=n%10;
            for(int i=1;i<=n;++i){
                sum=sum+(Math.pow(rem, i));
            }
            n=n/10;
        }
        if(sum==no){
            System.out.println("amstrong no.");
        }
        else{
            System.out.println("Not an amstrong no.");
        }
    }
}
