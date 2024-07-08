import java.util.*;
public class Even {
    public static void main(String[] args) {
        int no,sum=0;
        for(int i=1;i<=20;++i){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
