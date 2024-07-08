import java.util.*;
public class Stackqn {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        int sum=0;
        int n=4;
        int a;
        Scanner sc=new Scanner(System.in);
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // System.out.println(st);
        int m=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the element in stack");
           m=sc.nextInt();
           sum+=m;
           st.push(m);
        }
        int avg=(sum/n);
        System.out.println(avg);
        st.push(avg);
        System.out.println(st);
    }
}
