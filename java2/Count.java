import java.util.*;
public class Count {
    public static void main(String[] args) {
        int no, count=0;
        System.out.println("Enter a no.=");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while(no>0){
            no=no/10;
            count++;
            System.out.println(count);
        }
    }
}

