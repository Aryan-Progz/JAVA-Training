class Stat7{
    int a;
    int b;
    Stat7(){
        this(10,20);

    }
    Stat7(int x, int y){
        a=x;
        b=y;
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
class This2{
    public static void main(String[] args) {
        Stat7 s1=new Stat7();
        Stat7 s2=new Stat7(100,200);
        s1.show();
        s2.show();
    }
}