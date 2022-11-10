public class Test
{
	public static void main(String[] args)
	{
		YueShou zhangsan = new YueShou();

		zhangsan.doWhat(new ErHu());        
		System.out.println("--------------------");

		zhangsan.doWhat(new GangQin());
		System.out.println("--------------------");

		zhangsan.doWhat(new XiaoTiQin());
		System.out.println("--------------------");
	}
}