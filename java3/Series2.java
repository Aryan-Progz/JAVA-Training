import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        int x,n, no;
        int fact=1;
        double sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value:");
        System.out.println("Enter Range:");
        x=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<=n;++i){
            no=i;
            fact=1;
            while (no>0) {
                fact=fact*no;
                --no;                 
            }
            sum=sum+(Math.pow(x, i)/fact);
        }
        System.out.println(sum);
    }    
}
