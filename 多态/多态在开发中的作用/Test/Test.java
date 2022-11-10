public class Test
{
	public static void main(String[] args)
	{
        User u = new User2();

		User.test();
		User2.test();

		u.test1();
		u.test();

	}
}


class User
{
	public static void test()
	{
		System.out.println("User1方法被调用！！！！！！");
	}

	//-------------------------------------------------------

	public void test1()
	{
		System.out.println("User1实例方法被调用！！！！！");
	}
}


class User2 extends User
{
	public static void test()
	{
		System.out.println("User2方法被调用");
	}
	//-------------------------------------------------
	public void test1()
	{
		System.out.println("User2实例方法被调用");
	}
}