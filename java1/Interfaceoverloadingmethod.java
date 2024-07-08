interface It1{
    double m1(int a,String str);
    int m1(char ch);
}

public class Interfaceoverloadingmethod implements It1 {
    public double m1(int a,String str){
        System.out.println("m1 2-argument method");
        return 22.2;
    }
    public int m1(char ch){
        System.out.println("m1 1-argument method");
        return 40;
    }
    public static void main(String[] args) {
        Interfaceoverloadingmethod iom=new Interfaceoverloadingmethod();
        int i=iom.m1('p');
        System.out.println("Value="+i);
        double d=iom.m1(22, "Raj");
        System.out.println("Values="+d);
    }
}
