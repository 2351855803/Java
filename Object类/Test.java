package Object类;

public class Test {
    public static void main(String[] args) {
        User1 u = new User1();
        System.out.println(u.a.equals(u.b));
        System.out.println(u.a.equals(u.c));





    }
}


class User1{
    String a = "abc";
    String b = "qwer";
    String c = "abc";

}


