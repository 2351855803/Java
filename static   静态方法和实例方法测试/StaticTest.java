public class StaticTest
{
	public static void main(String[] args)
	{
		StaticTest.doSome();
		System.out.println("-----------------------");
		StaticTest s1 = new StaticTest();
		s1.doOther();
	}


    public static void doSome()
	{
		System.out.println("��̬����ִ�У�����������������������");

	}


	public void doOther()
	{
		System.out.println("ʵ������ִ�У�����������������������");

	}


}