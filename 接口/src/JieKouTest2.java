public class JieKouTest2 {
    public static void main(String[] args) {

        Q q = new R();
        System.out.println(q.jia(50,100));
        A a = new R();
        a.doWhat();
    }
}



interface Q{

    int jia(int n,int m);

}


interface W{
    int jian(int n,int m);
}


interface E{
    int cheng(int n,int m);

}

class R implements Q,W,E,A{


    public int jia(int n, int m) {
        return n + m;
    }
    public int jian(int n, int m) {
        return n - m;
    }
    public int cheng(int n, int m) {
        return n * m;
    }
    public void doWhat(){
        System.out.println("A的接口得到实现！！！！！");

    }
    public void doSome(){
        System.out.println("doSome!!!!!!!!!!!!!!!");
    }

}