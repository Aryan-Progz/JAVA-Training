import java.util.*;
public class String16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="";
        String str2="";
        String str3="";
        int i;
        System.out.println("Enter a String:");
        str1=sc.nextLine();
        System.out.println("Enter letter to remove");
        str2=sc.nextLine();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        for(i=0;i<str1.length();i++){
            if(ch1[i]==ch2[0]){
                continue;
            }
            else{
                str3=str3+ch1[i];
            }
        }
        System.out.println(str3);
    }
}
