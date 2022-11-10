public class Test
{

	{
	   System.out.println("实例方法块被调用！！！！");
	}


    public static void main(String[] args)
	{

		Test.JingTai();


		Test t1 = new Test();
		t1.ShiLi();


	
	
	}



	public Test()
	{
		System.out.println("构造方法被使用");
	}

	public Test(String name)
	{
		System.out.println("----------------" + name);
	}

	public void ShiLi()
	{
		System.out.println("实例方法被调用");
	}

	public static void JingTai()
	{
		System.out.println("静态方法被调用");
	}




}


/*

静态方法被调用
实例方法块被调用！！！！
构造方法被使用
实例方法被调用


======================实例方法块只有在new对象才被使用
*/