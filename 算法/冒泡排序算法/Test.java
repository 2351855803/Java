package 算法.冒泡排序算法;




/*
* 1 2 3 4 5 6 7
* 1 2 3 4 5 6
* 1 2 3 4 5
* 1 2 3 4
* 1 2 3
* 1 2
*
* 外面的循环 数组.length-1次
* 里面的循环 长度-1次
*
*
* */
public class Test {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};
        for(int i =num.length-1; i>0; i--){
            System.out.println(i);
            for(int j = 0; j<i; j++){
                System.out.println("----------" + j);
            }
        }
    }
}
