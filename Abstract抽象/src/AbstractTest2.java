public class AbstractTest2 {
    public static void main(String[] args) {
        Animal1 a  = new Dog();
        a.doSome();

    }
}

abstract class Animal1{
    public abstract void doSome();      /*抽象方法给子类进行方法覆盖，这样就不用写实例方法了*/
}
class Dog extends Animal1{
    public void doSome(){
        System.out.println("狗吃骨头");
    }
}