package equals方法;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {

        User u = new User(500,300);
        User u1 = new User(500,300);
        System.out.println(u == u1);   /*false*/

        User u2 = new User(100,200);
        User u3 = new User(100,200);
        System.out.println(u2 == u3);  /*false*/


        System.out.println(u1.equals(u));
        System.out.println(u1.equals(u2));
        System.out.println(u.equals(u1));



        /*===============================================================*/
        T1 t = new T1(100,200,300);
        T1 t2 = new T1(999,999,999);
        System.out.println(t.equals(t));
        System.out.println(t.equals(t2));
        System.out.println(t.hashCode());

    }
}





class User{
    int i;
    int b;

    public User(int i, int b) {
        this.i = i;
        this.b = b;
    }







    public boolean equals(Object obj){        //重写equals方法

        if(obj == null){
            return false;
        }



        if(obj instanceof User) {


            User us = (User) obj;         /*强制类型转换 因为object中没有 i b 变量，调用子类特有*/

            int i2 = us.i;
            int b2 = us.b;
            int i1 = this.i;
            int b1 = this.b;

            if( i1==i2 && b1==b2 ){
                return true;
            }
        }
        return false;

    }
}

class T1{

    private int i;
    private int l;
    private int j;

    public T1(int i, int l, int l1) {
        this.i = i;
        this.l = l;
        this.j = l1;
    }

    public T1() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T1 t1 = (T1) o;
        return i == t1.i &&
                l == t1.l &&
                j == t1.l;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, l, j);
    }
}