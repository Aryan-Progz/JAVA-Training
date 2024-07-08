interface I1{
    void show1();
}
class Abc implements I1{
    void show2(){
        System.out.println("Show 2");
    }
    public void show1(){
        System.out.println("Show 1");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Abc obj=new Abc();
        obj.show2();
        I1 i=new Abc();
        obj.show1();
    }
}
