public class Test
{
	public static void main(String[] args)
	{



		Wife qizi = new Wife();

		Husband zhangfu = new Husband();



		System.out.println(qizi.mingzi);
		System.out.println(qizi.shenfenzheng);



		System.out.println("------------------------------------");


		
		qizi.husband = zhangfu;
		zhangfu.wife = qizi;

		System.out.println(qizi.husband.wife.husband.wife.husband.shenfenzheng);



	}
}