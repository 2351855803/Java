public class JieKouTest1 {
    public static void main(String[] args) {
        System.out.println(A.i);
        System.out.println(A.s);

    }
}


/*接口支持多继承*/
interface A extends B,C{            /*接口中只有常量和抽象方法*/
    public static final int i = 100;     /*常量可以省略 public static final*/
    int s = 200;

    public abstract void doSome();    /*接口只能有抽象方法*/
    void doWhat();                      /*可以省略 public abstract*/
}

interface B{

}
interface C{

}

