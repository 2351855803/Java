public class ExtendsTest
{
	public static void main(String[] args)
	{   
		
		Student s = new Student("张三");
		XueXiao x = new XueXiao("高三",12,s);
		

		System.out.println(s.xingMingGet());

		System.out.println("----------------------------");

        x.xueShengGet().nianJiSet("大三");

		System.out.println(x.xueShengGet().nianJiGet());
	
	}
}


class XueXiao 
{



	private String nianJi;
	private int banJi;
	private Student xueSheng;
	





    //构造方法
	public XueXiao()
	{

	}

	public XueXiao(String nianJi, int banJi,Student xueSheng)
	{
		this.nianJi = nianJi;
		this.banJi = banJi;
		this.xueSheng = xueSheng;
	}






	//set get

	public void nianJiSet(String nianJi)
	{
		this.nianJi = nianJi;
	}
	public String nianJiGet()
	{
		return this.nianJi;
	}

	//----------------------------------

	public void banJiSet(int banJi)
	{
		this.banJi = banJi;
	}
	public int banJiGet()
	{
		return this.banJi;
	}

	//----------------------------------

	
	public void xueShengSet(Student xueSheng)
	{
		this.xueSheng = xueSheng;
	}
	public Student xueShengGet()
	{
		return this.xueSheng;
	}

	//----------------------------------


}






class Student extends XueXiao    //！！！！！！！！！！继承
{



	private String xingMing;



	//构造方法

	public Student()
	{

	}

	public Student(String xingMing)
	{
		this.xingMing = xingMing;
	}
	

	//set get
    public void xingMingSet(String xingMing)
	{
		this.xingMing = xingMing;
	}
	public String xingMingGet()
	{
		return this.xingMing;
	}


}




