package Object类;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {

        Addres a = new Addres();
        a.street = "万安";
        a.city = "泉州";
        User u = new User("张三",a);

        Addres b = new Addres();
        b.street = "万安";
        b.city = "泉州";
        User u1 = new User("张三",b);

        Addres c = new Addres();
        c.street = "洛安";
        c.city = "泉州";
        User u2 = new User("张四",b);

        System.out.println(u.equals(u1));
        System.out.println(u.equals(u2));




    }
}


class User{
    String name;
    Addres add;

    public User(String name, Addres add) {
        this.name = name;
        this.add = add;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        User user = (User) o;

        return this.name.equals(user.name) && this.add.equals(user.add);
    }


}

class Addres{
    String city;
    String street;

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Addres a = (Addres)obj;

        if(this.city.equals(a.city) && this.street.equals(a.street)){
            return true;
        }
        return false;
    }
}