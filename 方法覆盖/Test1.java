public class Test1
{
	public static void main(String[] args)
	{
		Chinese c = new Chinese("张三");
		c.sayWhat();
		American a = new American("Jack");
		a.sayWhat();



	}
}



class People
{


	private String name;




	//构造方法
	public People()
	{

	}
	public People(String name)
	{
		this.name = name;
	}



    //set get
	public void nameSet(String name)
	{
		this.name = name;
	}

	public String nameGet()
	{
		return this.name;
	}



    //做什么方法
	public void sayWhat()
	{
		System.out.println(this.name + "............");

	}
}


//中国人
class Chinese extends People
{   
	//无参数
	public Chinese()
	{

	}
	//有参数
	public Chinese(String name)
	{
		this.nameSet(name);
	}

    //做什么方法
	public void sayWhat()
	{
		System.out.println(this.nameGet() + "讲中文");

	}

}

//美国人
class American extends People
{   
	//无参数
	public American()
	{

	}
	//有参数
	public American(String name)
	{
		this.nameSet(name);
	}

    //做什么方法
	public void sayWhat()
	{
		System.out.println(this.nameGet() +" " + "speak english");

	}

}