package 数组.酒店管理系统;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        Room room = new Room();

        //把所有房间对象放进二维数组
        room.seet();

        //订房间
        room.ding();
        room.look();
        room.tuiFang(2,2);
        System.out.println("---------------------------------------------------------------");
        room.look();



    }
}





class Room{

    //设置酒店几层几间房间
    int ceng;
    int fangJian;


    //有参构造方法
    public Room(int ceng, int fangJian) {
        this.ceng = ceng;
        this.fangJian = fangJian;

        //判断房间层数
        System.out.println("当前层数为" + ceng + "房间数为" + fangJian);
    }
    //无参构造
    public Room() {
    }

    //为酒店二维数组赋值
    Room[][] rooms = new Room[3][3];


    //遍历二维数组
    public void seet(){
        for(int i=0; i<rooms.length; i++) {
            for(int j=0; j<rooms[i].length; j++){
                FangJian fang = new FangJian();
                rooms[i][j] = fang;
                //通过楼层判断房间类型
                if((i+1)==1){
                    fang.leiXing = "双人房";
                }else if((i+1)==2){
                    fang.leiXing = "单人房";
                }else if((i+1)==3){
                    fang.leiXing = "阳台房";
                }
                //默认房间都为空
                fang.zhuangKuang = false;
                //判断房间号
                if((i+1)==1){
                    fang.bianHao = 101+j;
                }else if((i+1)==2){
                    fang.bianHao = 201+j;
                }else if((i+1)==3){
                    fang.bianHao = 301+j;
                }
            }

        }
    }

    //提供订房间方法
    public void ding() {

        //客户选择房间
        System.out.println("本酒店提供三层楼，每层三个房间！！");
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入想要预定的楼层:");
        int num = s.nextInt();
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        System.out.print("请输入想要预定的房间:");
        int num1 = s1.nextInt();

        //防止客户输入过大层或者房间
        if (num > 3 || num1 > 3) {
            System.out.println("层数或者房间数输入错误！！！");
            return;
        }

        FangJian f1 = (FangJian) rooms[num - 1][num1 - 1];


        System.out.print("房间信息：");
        System.out.print("房间门牌号： " + f1.bianHao);
        System.out.print("房间的类型： " + f1.leiXing);
        //判断房间是否空着
        if (f1.zhuangKuang) {
            System.out.println("房间已经有客人了，无法预订，请选择其他房间！！！");
        } else {
            System.out.println("房间空着，可以预定！！！");
            f1.zhuangKuang = true;
        }
    }

    //看房间状况
    public void look(){
        for(int i = 0; i<rooms.length; i++){
            for(int j = 0; j<rooms[i].length; j++){
                FangJian f = (FangJian)rooms[i][j];
                System.out.println("房间类型" + f.leiXing);
                System.out.println("房间编号" + f.bianHao);
                if(f.zhuangKuang){
                    System.out.println("有客人入住！");
                }else{
                    System.out.println("房间空！！！");
                }
                System.out.println("------------------");
            }
        }

    }

    //退房
    public void tuiFang(int i, int i2){
        FangJian f = (FangJian)rooms[i-1][i2-1];
        f.zhuangKuang = false;
        System.out.println("退房成功！！！！");
    }


}



class FangJian extends Room{
    int bianHao;
    String leiXing;
    boolean zhuangKuang;
}