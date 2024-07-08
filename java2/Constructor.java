class Calculator {
    int s1,s2,s3;
    public Calculator(){
        s1=4;
        s2=5;
        s3=3;
    }
    void Area(){
        System.out.println("area="+(0.5*s1*s2));
    }
    void Perimeter(){
        System.out.println("perimeter="+(s1+s2+s3));

    }
}
class Constructor{
    public static void main(String[] args) {
        Calculator c= new Calculator();
        c.Area();
        c.Perimeter();
    }
}
