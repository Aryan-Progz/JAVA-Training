public class String13 {
    public static void main(String[] args) {
        //conversion of strong to StringBuffer
        String str1="Aryan";
        StringBuffer sb1= new StringBuffer(str1);
        System.out.println(sb1);
        //conversion of StringBuffer to String
        StringBuffer sb2=new StringBuffer();
        String str2=sb2.toString();
        System.out.println(str2);
    }
}
