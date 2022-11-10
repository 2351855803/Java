package 数组;

public class Test1 {
    public static void main(String[] args) {

        int[] a = {100,200,300,400};




        /*每个数组对象都有length属性*/
        System.out.println("元素的个数为：" + a.length); /*元素的个数为：4*/




        /*通过下标进行数组元素存取*/
        for( int i = 0; i<a.length; i++){
            System.out.println("第" + i + "元素为：" + a[i]);
        }
        /*
        * 第0元素为：100
        *第1元素为：200
        *第2元素为：300
        *第3元素为：400
        */

        /*赋值*/
        a[0] = 11111;
        System.out.println(a[0]);



        /*=========================================================================*/


        /*一维动态数组的初始化*/

        int[] b = new int[5];
        //System.out.println(b[5]);   ArrayIndexOutOfBoundsException
        System.out.println(b[4]);    //0

    }
}
