import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println((char)a[i]+"-"+a[i]+" ");
        }

    }
}
