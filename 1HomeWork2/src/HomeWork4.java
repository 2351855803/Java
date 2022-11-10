public class HomeWork4 {
    public static void main(String[] args) {
        /*用户输入数字*/

        java.util.Scanner s1 = new java.util.Scanner(System.in);
        System.out.print("请输入第一个数字：");
        double n1 = s1.nextDouble();

        java.util.Scanner s2 = new java.util.Scanner(System.in);
        System.out.print("请输入第二个数字：");
        double n2 = s2.nextDouble();

        Number n = new Number(n1, n2);

        System.out.println("乘法结果：" + n.chengFa() + "除法结果" + n.chuFa() +"加法结果" + n.jiaFa() + "减法结果" + n.jianFa());



    }
}

class Number{


    /*定义两个数*/
    private double n1;
    private double n2;


    /*构造方法*/

    public Number() {
    }

    public Number(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /*set get*/

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    /*定义 加 减 乘 除*/
    public double jiaFa(){
        return this.n1 + this.n2;
    }

    public double jianFa(){
        return this.n1 - this.n2;
    }

    public double chengFa(){
        return this.n1 * this.n2;
    }
    public double chuFa(){
        return this.n1 / this.n2;
    }


}