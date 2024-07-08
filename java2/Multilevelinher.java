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
class C extends B{
    public void showC(){
        System.out.println("I am in showC");
    }
}
public class Multilevelinher {
    public static void main(String[] args) {
        B obj=new B();
        obj.showA();
        obj.showB();
        A obj1=new A();
        obj1.showA(); 
        C obj2=new C();
        obj2.showC();
        obj2.showA();
        obj2.showB();
    }
}

