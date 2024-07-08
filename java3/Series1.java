import java.util.*;
public class Series1 {
    public static void main(String[] args) {
        int x,n;
        double sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value:");
        System.out.println("Enter Range:");
        x=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<=n;++i){
            sum=sum+(Math.pow(x, i)/i);
        }
        System.out.println(sum);
    }    
}
