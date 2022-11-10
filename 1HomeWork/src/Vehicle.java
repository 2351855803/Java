public class Vehicle {
    private int speed;
    private int size;
    boolean qiDong;
    SuDu sudu;

    //构造方法


    public Vehicle(boolean qiDong, SuDu sudu) {
        this.qiDong = qiDong;
        this.sudu = sudu;
    }

    public Vehicle() {
    }
    //set get

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    //设置移动方法
    public void move(boolean qiDong, int speed, SuDu sudu)
    {

        if(qiDong)
        {
            System.out.println("车开始移动！！");
            this.speed = speed;
            System.out.println("当前车速为：" + getSpeed());
            sudu.speedDown(20);
            sudu.speedUp(40);

        }else
        {
            System.out.println("请启动车辆！！！");
        }

    }




}
