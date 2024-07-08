import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean flag=false;
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int j=1;
        int i=0;
        int miss=0;
        for(i=0,j=1;i<a.length;i++,j++){
            if(a[i]!=j){
                miss=j;
                break;
            }
        }
        System.out.println(miss);
    }
}
