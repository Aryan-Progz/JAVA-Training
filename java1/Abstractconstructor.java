abstract class Test{
    Test(){
        System.out.println("Abstractor class constructor");
    }
}

public class Abstractconstructor extends Test {
    Abstractconstructor(){
        System.out.println("Normal class constructor");
    }
    public static void main(String[] args) {
        new Abstractconstructor();
    }
}
