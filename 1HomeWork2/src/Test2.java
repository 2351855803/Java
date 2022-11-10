public class Test2 {
    public static void main(String[] args) {

        MyTime mt = new MyTime(12,30,30);
        mt.ziDong();



    }
}




class MyTime{

    /*定义小时 分钟 秒*/
    private int hour;
    private int minute;
    private int second;


    /*set get*/

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    /*构造方法*/

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /*设置 小时 分钟 秒 的加减*/

    public void ziDong(){
        while(true){
            for(long i = 0 ; i == 1000000000; i++);{
                this.second++;
            }

            if(this.second == 60){
                this.second = 0;
                this.minute++;
            }else if(this.minute == 60){
                this.minute = 0;
                this.hour++;
            }else if(this.hour == 24){
                this.hour = 0;
            }

                System.out.println(this.hour + "时" + this.minute + "分" + this.second + "秒");









        }
    }


}
