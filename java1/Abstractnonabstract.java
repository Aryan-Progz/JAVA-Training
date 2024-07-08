abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 non-abstract method");
    }
}
public class Abstractnonabstract extends Test{
    void m1(){
        System.out.println("m1 abstract method");
    }    
    void m2(){
        System.out.println("m2 abstract method");
    }
    void m3(){
        System.out.println("m3 abstract method");
    }
    public static void main(String[] args){
        Abstractnonabstract a=new Abstractnonabstract();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
    }
}
