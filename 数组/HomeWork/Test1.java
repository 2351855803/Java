package 数组.HomeWork;


import Object类.toStringTest;

public class Test1 {
    public static void main(String[] args){

        Stack s = new Stack();

        System.out.println(s.yaZhan(new T1()));
        s.index1++;
        System.out.println("========================================");
        System.out.println(s.yaZhan(new T1()));
        s.index1++;
        System.out.println("========================================");
        System.out.println(s.yaZhan(new T1()));
        s.index1++;
        System.out.println("========================================");
        System.out.println(s.yaZhan(new T1()));
        s.index1++;
        System.out.println("========================================");
        System.out.println(s.yaZhan(new toStringTest()));
        s.index1++;
        System.out.println("========================================");
        System.out.println(s.yaZhan(new toStringTest()));
        s.index1++;
        System.out.println("========================================");













    }
}


class Stack{








    //判断内存
    int index1 = 0;



    //无参构造  初始化内存
    public Stack() {
        System.out.println("初始化成功！初始内存为5！");
    }




    Object[] object = new Object[5];



    //设置压栈方法
    public Object yaZhan(Object obj){



        if(index1 >= 5){
            return "溢出！！";
        }


        this.object[index1] = obj;

        System.out.println("当前使用下标：" + index1);


        return object[index1];



    }

}

class T1{

}