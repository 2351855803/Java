package HomeWork;

public class JieKouTest {
    public static void main(String[] args) {
        Computer sanXing = new Computer(new ShuBiao());
        sanXing.getChaRu().doSome();

    }
}


class Computer{
    private Insert chaRu;

    /*构造方法*/

    public Computer() {
    }

    public Computer(Insert chaRu) {
        this.chaRu = chaRu;
    }
    /*setget*/

    public Insert getChaRu() {
        return chaRu;
    }

    public void setChaRu(Insert chaRu) {
        this.chaRu = chaRu;
    }
}



interface Insert{
    void doSome();
}




class ShuBiao implements Insert{
    public void doSome(){
        System.out.println("鼠标类被实现！！！！！");
    }
}
class JianPan implements Insert{
    public void doSome(){
        System.out.println("键盘被实现！！！！！");
    }

}
class XianShiQi implements Insert{
    public void doSome(){
        System.out.println("显示器被实现1！！！！！");
    }

}
class DaYinJi implements Insert {
    public void doSome() {
        System.out.println("打印机被实现！！！！！！");
    }
}
