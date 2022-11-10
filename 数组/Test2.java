package 数组;

public class Test2 {
    public static void main(String[] args) {


        Test2.println(new int[]{200,300,300,300});


        Test2.println(new int[50]);

    }


    public static void println(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}




