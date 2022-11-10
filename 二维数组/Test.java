package 二维数组;

public class Test {
    public static void main(String[] args) {

        String[][] str = {
                {"abc","qwe","ppp"},
                {"qqq","www","eeee"},
                {"oooo","yyyy","iiiii"},
        };

        for(int i= 0; i<str.length; i++){
            for(int j = 0; j<str[i].length; j++){
                System.out.println(str[i][j]);
                System.out.println("内层循环循环了" + (j+1) + "次！！！");
            }
            System.out.println("外层循环使用了" + (i+1) + "次！！！");
        }

    }
}
