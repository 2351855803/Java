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
		System.out.println("��������");
		a.v = s.nextInt();

		if(i == a.v)
		{
			System.out.println("��ȷ");

		}
		

		

	}
}