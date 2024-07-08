import java.util.Scanner;
class Area{
    int len,bre;
    public Area(int l, int b){
        len=l;
        bre=b;
    }
    public void areaofRect(){
        System.out.println("Area="+(len*bre));
    }
}
public class Paraconstructor2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a=new Area(l,b);
        a.areaofRect();
    }
}
