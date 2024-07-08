import java.util.ArrayDeque;
import java.util.*;
public class Queueqn {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        Queue<Integer> k=new ArrayDeque<Integer>();
        Queue<Integer> l=new ArrayDeque<Integer>();
        Scanner sc=new Scanner(System.in);
        int n,i,o;
        System.out.println("Enter the no.");
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++){
            o=sc.nextInt();
            if(o%2==0){
                k.add(o);
            }
            else{
                l.add(o);
            }
            q.add(o);
        }
        System.out.println(k);
        System.out.println(l);
        
    }
}
