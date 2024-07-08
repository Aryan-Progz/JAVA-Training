public class This1 {
    int a;
    int b;
    This1(int a,int b){
        this.a=a;
        this.b=b;

    }
    void display(){
        //displaying values of variables a and b
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args) {
        This1 object=new This1(40, 80);
        object.display();
    }
}
