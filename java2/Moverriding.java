import java.util.*;
class Test{
    int cash=2000,gold;
    public void properties(){
        System.out.println("Properties");
    }
    public void bike(){
        System.out.println("Splendor+");
    }
}
class Test1 extends Test{
    int cash=5000;
    public void bike(){
        System.out.println("HB");
        System.out.println(cash);
    }
}

public class Moverriding {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.properties();
        t1.bike();
    }    
}
