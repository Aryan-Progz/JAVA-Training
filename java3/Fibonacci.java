import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int f0=0,f1=1,f2,range;
        System.out.println("Enter Range");
        Scanner sc=new Scanner(System.in);
        range=sc.nextInt();
        System.out.println(f0+"\t"+f1);
        for(int i=3;i<=range;++i){
            f2=f0+f1;
            System.out.println("\t"+f2);
            f0=f1;
            f1=f2;
        }
    }
}
