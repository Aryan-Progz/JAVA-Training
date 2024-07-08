import java.util.*;
public class Reversearr {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        int res[]=new int[4];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }  
        res[3]=-1;
        for(int i=0;i<4;i++){
            System.out.print(" "+res[i]);
        }      
    }
    
}
