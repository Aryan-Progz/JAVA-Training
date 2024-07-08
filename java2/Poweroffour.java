import java.util.*;
public class Poweroffour {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i*i*i*i==n){
                System.out.println("true");
                break;
            }
            else{
                System.out.println("false");
                break;
            }
        }

    }
}
