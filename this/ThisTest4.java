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

   
	//�޲������в������췽��
	public User()
	{
		this("����",50);           // ��������������������ͨ��this();�����������вι��췽��
	}

	public User(String name, int num)
	{
		this.name = name;
		this.num = num;
	}
}