class A{
    public void showA(){
        System.out.println("I am in showA");
    }
}
class B extends A{
    public void showB(){
        System.out.println("I am in showB");
    }
}
class C extends A{
    public void showC(){
        System.out.println("I am in showC");
    }
}
class D extends A{
    public void showD(){
        System.out.println("I am in showD");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        B obj=new B();
        obj.showA();
        obj.showB();
        C objC=new C();
        objC.showA();
        objC.showC();
        D objD=new D();
        objD.showA();
        objD.showD();
        A obj1=new A();
        obj1.showA();
    }
}
