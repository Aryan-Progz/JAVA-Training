import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        int arr[]=new int[5],sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<5;++i){
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are: ");
        for(int i=0;i<5;++i){
            sum=sum+arr[i];
            
        }
        System.out.println("sum+ "+sum);
    }
    
}
