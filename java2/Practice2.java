import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        boolean flag=true;
        int count=0;
        System.out.println("Enter elements of an Array");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;

                }
            }
        }
        if(count>0){
            flag=true;
            System.out.println(flag);
        }
        else{
            flag=false;
            System.out.println(flag);
        }
    }
}
