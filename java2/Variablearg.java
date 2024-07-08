class Variablearg {
    void m1(char ch,int... a){
        System.out.println(ch);
        for(int a1:a){
            System.out.println(" "+a1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Variablearg v=new Variablearg();
        v.m1('A');
        v.m1('B', 10);
        v.m1('C',10,20);
        v.m1('D', 10,20,30,40);
    }
}
