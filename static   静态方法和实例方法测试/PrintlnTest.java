public class PrintlnTest
{
	public static void main(String[] args)
	{
		
		PrintlnTest t1 = new PrintlnTest();


        t1.println1();

        PrintlnTest.println2();






	}

    public void println1()
	{   
		
		System.out.println(User.name + "实例方法引用");
	}

	public static void println2()
	{
		
		System.out.println(User.name + "静态方法引用");
	}

}