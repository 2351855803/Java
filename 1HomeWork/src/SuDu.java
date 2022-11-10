public class SuDu {

    //加速
    public void speedUp(int speed)
    {
        Vehicle v = new Vehicle();
        v.setSpeed(v.getSpeed() + speed);
        System.out.println("当前车速经过加速为：" + v.getSpeed());
    }
    //减速
    public void speedDown(int speed)
    {
        Vehicle v = new Vehicle();
        v.setSpeed(v.getSpeed() - speed);
        if((v.getSpeed() - speed) <= 0)
        {
            v.setSpeed(0);
        }
        System.out.println("当前车速经过减速为：" + v.getSpeed());
        System.out.println("车停止了！！！");
    }
}
