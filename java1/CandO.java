//class and object
import java.util.Scanner;
class Strong{
    int num;
    int rem, fact=0;
    public Strong(int n){
        num=n;
    }
    public void CheckStrong(){
        while(num>0){
            rem=num%10;
            num=num/10;
            num=rem;
            
        }
    }
}
public class CandO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.:");
        int n=sc.nextInt();
        Strong s=new Strong(n);
    }
}
