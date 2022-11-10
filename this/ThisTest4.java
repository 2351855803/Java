public class ThisTest4
{
	public static void main(String[] args)
	{
		User u1 = new User();
		System.out.println(u1.nameGet());
		System.out.println(u1.numGet());

		
	}
}



class User
{
	private String name;
	private int num;

	//set get
	public String nameGet()
	{
		return this.name;
	}


	public int numGet()
	{
		return this.num;
	}

   
	//无参数和有参数构造方法
	public User()
	{
		this("张三",50);           // ！！！！！！！！！！通过this();来调用其他有参构造方法
	}

	public User(String name, int num)
	{
		this.name = name;
		this.num = num;
	}
}