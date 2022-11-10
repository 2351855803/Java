public class FinalTest2 {
    public static void main(String[] args) {

        final Test t = new Test();
        //t = new Test(2);       //无法为最终变量t分配值
    }
}


class Test{
    int i;

    public Test(int i) {
        this.i = i;
    }

    public Test() {
    }
}