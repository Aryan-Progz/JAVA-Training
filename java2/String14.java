public class String14 {
    public static void main(String[] args) {
        String str="Aryan";
        String rev=" ";
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            rev=ch[i]+rev;
        }
        System.out.println(rev);
    }
}
