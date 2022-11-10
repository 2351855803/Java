package 方法.String常用方法;



/*String 常用构造方法*/


public class Test1 {
    public static void main(String[] args) {

        byte[] num1 = {97,98,99};
        System.out.println(num1[0]);  //97


        /*将byte数组全部转换为字符串*/
        String num2 = new String(num1);
        System.out.println(num2);  //abc

        /*将byte数组部分转换为字符串*/
        String num3 = new String(num1,1,2);
        System.out.println(num3);

        /*将char数组转换为字符串*/
        char[] chars ={'1','5','7','人'};
        String num4 = new String(chars);
        System.out.println(num4);

        /*将char类型数组部分转为字符型*/
        String num5 = new String(chars,2,2);
        System.out.println(num5);

    }
}
