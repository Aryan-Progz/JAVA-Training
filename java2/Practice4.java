//edit distance
 import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        String s="ycce";
        String t="ycsce";
        int out=0,count=0;
        if(s.length()<t.length()){
            out=s.length()-t.length();
           
        }
        else if(t.length()<s.length()){
            out=t.length()-s.length();
            
        }
        else if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=t.charAt(i)){
                    count++;

                }

            }
            out=count;
        }
        System.out.println(out);
    }
}
