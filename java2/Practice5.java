public class Practice5 {
    public static void main(String[] args) {
        String s="0000000000000000000000000100000011";
        int len=s.length();
        int count=0;
        System.out.println(len);
        if(len==32){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
