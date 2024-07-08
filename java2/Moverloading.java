import java.util.*;
class Test{
    void add(int a, int b){
        System.out.println("Result is"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Result is"+(a+b+c));
    }
    void add(int a,int b,int c,int d){
        System.out.println("Result is"+(a+b+c+d));
    }
}
public class Moverloading {
    public static void main(String[] args) {
        Test t=new Test();
        t.add(2, 3);
        t.add(4, 5, 6);
        t.add(1, 2, 3, 4);
    }
}
