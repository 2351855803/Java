public class AbstractTest1 {
    public static void main(String[] args) {

    }
}


abstract class Animal{
    public abstract void move();
}


class Cat extends Animal{            /*java: Cat不是抽象的, 并且未覆盖Animal中的抽象方法move()*/
    public void move(){
        
    }
}
