public class User
{
	public static void main(String[] args)
	{
		Account zhanghu = new Account();

		//账户设置
		zhanghu.idSet("1000");
		//账户获取
		System.out.println("账户为：" + zhanghu.idGet());


		//余额设置
		zhanghu.balanceSet(2000);
		//余额获取
		System.out.println("余额为：" + zhanghu.balanceGet());


		//存入100
		zhanghu.cunKuan(100);
		System.out.println("存款后余额为：" + zhanghu.balanceGet());

		//取960
		zhanghu.quKuan(960);
		System.out.println("取款后余额为：" + zhanghu.balanceGet());

		//取2000
		zhanghu.quKuan(2000);
		





	}
}