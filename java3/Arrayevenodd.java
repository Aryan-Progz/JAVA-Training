import java.util.Scanner;

public class Arrayevenodd {
    public static void main(String[] args) {
        int arr[]=new int[10],even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;++i){
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are: ");
        for(int i=0;i<arr.length;++i){
            if (arr[i]%2==0) {
                even++;
        }else{
            odd++;
        }
            
        }
        System.out.println("Even="+even+" Odd= "+odd);
    }
}
