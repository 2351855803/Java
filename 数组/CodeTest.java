package 数组;

public class CodeTest {
    public static void main(String[] args) {




        if(args.length != 2 || !args[0].equals(new Code().zhangHu) || !args[1].equals(new Code().miMa)){
            System.out.println("请输入正确的账号和密码！！");
            return;
        }


        if(args[0].equals(new Code().zhangHu) && args[1].equals(new Code().miMa)){
            System.out.println("账号密码正确！！！！");
            System.out.println("成功进入系统！！！！");
        }

        System.out.println("!!!!!!!!");



    }
}

class Code{
    String zhangHu = "admin";
    String miMa = "123123";
}