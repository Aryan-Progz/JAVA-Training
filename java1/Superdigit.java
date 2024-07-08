// hackerrank question
// super_digit("9875")
// =9+super_digit("875")
// =9+8+super_digit("75")
// Base case =9+8+7+super_digit("5")

/**
 * Superdigit
 */
import java.util.Scanner;
public class Superdigit {
    public static void main(String[] args) {
        int sum;
        String str;
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        
            int n=str.length();
            if(n==0){
                return 0;
            }
            else{
                int charToNum=(str.charAt(0)-'0');
                return charToNum+sum(str.substyring(1,n));
            }
        
    }
}