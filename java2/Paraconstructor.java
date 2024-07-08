class Rectangle{
    int len,bre;
    public Rectangle(int l, int b){
        len=l;
        bre=b;
    }
    void areaOfRectangle(){
        System.out.println("Area="+(len*bre));
    }
}
public class Paraconstructor {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        r.areaOfRectangle();
        Rectangle r1=new Rectangle(5,8);
        r1.areaOfRectangle();
    }
}
