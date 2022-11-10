package 访问权限;

public class Test {
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.i);
        System.out.println(t.i2);
        System.out.println(t.i3);
    }
}



class Test1{
    //公开的
    public int i;

    //私有的
    /*private int i1*/

    //受保护的
    protected int i2;

    //默认的
    int i3;
}

class Test2 extends Test1{

}
