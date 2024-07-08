public class String15 {
    public static void main(String[] args) {
        String str="nayan";
        String rev="";
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            rev=ch[i]+rev;
        }
        System.out.println(rev);
        if(str.equals(rev)){
        System.out.println("It is a palindrome");
        }
        else{
        System.out.println("It is not a Palindrome");
        }
    }
}
