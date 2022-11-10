public class B
{
	A a; 

	public B(A a)
	{
		this.a = a;

	}
	 
	public void cai(int i)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("输入数字");
		a.v = s.nextInt();

		if(i == a.v)
		{
			System.out.println("正确");

		}
		

		

	}
}