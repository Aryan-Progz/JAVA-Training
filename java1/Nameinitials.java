import java.util.*;
public class Nameinitials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a Name");
        str=sc.nextLine();
        String[] letters = str.split("\s+");
        StringBuilder initials= new StringBuilder();
        for(String letter: letters ){
            initials.append(letter.charAt(0));
        }
        System.out.println("Initials:"+ initials.toString());
       
    }
}

