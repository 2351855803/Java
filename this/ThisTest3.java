public class ThisTest3
{
	public static void main(String[] args)
	{
		User u = new User();
       
	    u.nameSet("张三");
		u.numSet(11111);

		System.out.println(u.nameGet());
		System.out.println(u.numGet());
	}
}



class User
{   //姓名
	private String name;
	//号码
	private int num = 22;


    //实例变量的set和get
	//姓名set get
	public void nameSet(String name)
	{
		this.name = name;
		//this.name = name;                  //!!!!!!!!!!!!!!!!
	}
	public String nameGet()
	{
		return this.name;
	}

	//号码set get
	public void numSet(int num)
	{
		this.num = num;
		//this.num = num;                  //!!!!!!!!!!!!!!!!
	}
	public int numGet()
	{
		return this.num;
	}


}

//--------------------->      若没有加this，则由于就近原则，实例变量无法得到赋值