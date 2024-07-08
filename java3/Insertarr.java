import java.util.*;
public class Insertarr {
    public static void main(String[] args) {
        int arr[]={23,43,51,38,76,45,58,67,96,14};
        int indexPosition=2;
        int newValue=5;
        System.out.println("Original Array:"+Arrays.toString(arr));
        for(int i=arr.length-1;i>indexPosition;i--){
            arr[i]=arr[i-1];

        }
        arr[indexPosition]=newValue;
        System.out.println("New Array:"+Arrays.toString(arr));
    }    
}
