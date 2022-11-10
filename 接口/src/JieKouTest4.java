public class JieKouTest4 {
    public static void main(String[] args) {
        GuKe zhangsan = new GuKe(new ZhongCan());
        zhangsan.getCaidan().rou();
        zhangsan.getCaidan().cai();
        zhangsan.setCaidan(new XiCan());
        zhangsan.getCaidan().cai();
        zhangsan.getCaidan().rou();



    }
}

class GuKe{
    private CaiDan caidan;

    public GuKe(CaiDan caidan) {
        this.caidan = caidan;
    }

    public GuKe() {
    }

    /*setget*/

    public CaiDan getCaidan() {
        return caidan;
    }

    public void setCaidan(CaiDan caidan) {
        this.caidan = caidan;
    }
}






class ZhongCan implements CaiDan{
    public void cai(){
        System.out.println("中餐做的菜");
    }
    public void rou(){
        System.out.println("中餐做的肉");
    }
}


class XiCan implements CaiDan{
    public void cai(){
        System.out.println("西餐做的菜");
    }
    public void rou(){
        System.out.println("西餐做的肉");
    }
}


interface CaiDan{
     void rou();
     void cai();
}