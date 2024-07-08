
public class Palindrome {
    public static void main(String[] args) {
        int no=121,rem,rev=0, sum=0;
        int nsave=no;
        
        while (no>0) {
            rem=no%10;
            rev=(rev*10)+rem;
            no=no/10;    
        }
       
        if(rev==nsave){
            System.out.println("Palindrome no.");
        }
        else{
            System.out.println("Not a Palindrome no.");
        }
    }
}
