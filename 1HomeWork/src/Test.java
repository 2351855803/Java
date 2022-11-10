public class Test {
    public static void main(String[] args) {


        Vehicle v = new Vehicle();

        v.move(true,  60, new SuDu());

        System.out.println("-----------------------------------");

        v.move(false,  60, new SuDu());




    }
}
