import java.util.*;
public class Mulwithoutoperator {
    public static void main(String[] args) {
        int x,y,sum=0;
        System.out.println("Enter x value:");
        System.out.println("Enter y value:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=1;i<=y;++i){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
