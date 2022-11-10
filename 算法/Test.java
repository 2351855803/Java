package 算法;

public class Test {
    public static void main(String[] args) {

        int[] num = {50,610,8,53,6,4,9,5};

        int i = 51;



        System.out.println(Test.arraySearch(num,6));
        System.out.println(Test.arraySearch(num,610));
        System.out.println(Test.arraySearch(num,6100));
    }

    public static int arraySearch(int[] num, int i) {
        for(int j = 0; j < num.length; j++){
            if(num[j] == i){
                return j;
            }
        }
        return -1;
    }
}
