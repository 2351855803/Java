package Object类;

public class NiMingLeiTest {
    public static void main(String[] args) {


        T1 t = new T1(){
            public void doSome(){
                System.out.println("匿名类被使用！！！！！");
            }
        };

        t.doSome();



    }
}



interface T1{
    void doSome();
}



class T2{

}

