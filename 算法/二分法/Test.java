package 算法.二分法;

public class Test {


    public static void main(String[] args) {

        int[] num = {100, 200, 300, 400, 500, 600, 700, 800, 999};
        System.out.println(Test.arrySearch1(num,300));
        System.out.println(Test.arrySearch1(num,100));
        System.out.println(Test.arrySearch1(num,999));
        System.out.println(Test.arrySearch1(num,1300));



    }



    public static int arrySearch1 ( int[] num, int i){

            int begain = 0;
            int end = num.length - 1;


            while (begain <= end) {    //假若数据在数组里,假设到了最后一个元素的话begain会等于end，如果还不相等，则不存在
                int mid = (begain + end) / 2;

                if (num[mid] == i) {
                    return (begain + end) / 2;
                } else if (i < num[mid]) {
                    end = mid - 1;
                } else if (i > num[mid]) {
                    begain = mid + 1;
                }

            }
        return -1;


        }


}







