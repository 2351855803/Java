public class ThisTest2
{
	public static void main(String[] args)
	{
		Num u = new Num();
		u.ceShi();

	}

}


class Num
{
	int id;
	static int haoma;

	public void ceShi()
	{
		System.out.println(this.id + "------------------");
		System.out.println(haoma);

	}
}