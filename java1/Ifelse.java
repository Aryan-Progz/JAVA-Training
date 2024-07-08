import java.util.*;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("Not an adult");
        }else{
            System.out.println("Adult");
        }
    }
}
