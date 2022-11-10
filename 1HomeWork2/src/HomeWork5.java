public class HomeWork5 {
    public static void main(String[] args) {

        Person p = new Person("张三",55);
        p.disPlay();


    }
}

class Person{
    private String name;
    private int age;

    /*构造方法*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*set get*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void disPlay(){
        System.out.println("姓名：" + this.getName() + "年龄：" + this.getAge());
    }



}
