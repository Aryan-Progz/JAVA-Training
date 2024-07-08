//stockspanproblem
import java.util.*;
public class Spanarr {
    public static void main(String[] args) {
        int marks[]=new int[]{100,80,60,70,60,75,85};
        int res[]=new int[7];
        res[0]=1;
        for(int i=0;i<marks.length;i++){
            for(int j=i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    res[j]=1;
                }else{
                    res[j]=2*2*2;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
