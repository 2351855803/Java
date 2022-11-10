public class JieKouTest3 {
    public static void main(String[] args) {
        chiBang fly = new Cat();
        fly.fly();

        //fly.doSOme();/*不能通过接口直接调用子类特有方法，和继承一样*/

        //Cat f = (Cat)fly;
        //f.doSOme();

        Animal a = new Cat();
        a.doWhat();
        //调用Cat子类特有方法
        //a.doSome();   报错
        Cat c = (Cat)a;
        c.doSome();
    }
}



class Animal{
    public void doWhat(){
        System.out.println("doWhat!!!!!!!!!!!!!!!!!!!!!");
    }

}

interface chiBang{
    void fly();
}
class Cat extends Animal implements chiBang{
    public void fly(){
        System.out.println("Cat 飞");
    }

    public void doSome(){
        System.out.println("doSome!!!!!!!!!!!!!!!");
    }

}