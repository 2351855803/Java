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
		System.out.println("User1���������ã�����������");
	}

	//-------------------------------------------------------

	public void test1()
	{
		System.out.println("User1ʵ�����������ã���������");
	}
}


class User2 extends User
{
	public static void test()
	{
		System.out.println("User2����������");
	}
	//-------------------------------------------------
	public void test1()
	{
		System.out.println("User2ʵ������������");
	}
}