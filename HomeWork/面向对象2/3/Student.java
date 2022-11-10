public class Student
{
	//名字
	private String name;
	//年龄
	private int age;
	//地址
	private String addres;
	//邮编
	private String zipCode;
	//手机
	private String mobile;

    
	 
	//无参数构造方法
	public Student()
	{

	}
    
	//有参数构造方法
	public Student(String name, int age, String addres, String zipCode, String mobile)
	{
		this.name = name;		
		this.age = age;
		this.addres = addres;
		this.zipCode = zipCode;
		this.mobile = mobile; 
	}




	//set get
    public String nameGet()
	{
		return this.name;
	}

    public void nameSet(String name)
	{
		this.name = name;
	}

	//-----------------------------
	public int ageGet()
	{
		return this.age;
	}

	public void ageSet(int age)
	{
		this.age = age;
	}

	//-----------------------------

    public String addresGet()
	{
		return this.addres;
	}

    public void addresSet(String addres)
	{
		this.addres = addres;
	}

	//-----------------------------

    public String zipCodeGet()
	{
		return this.zipCode;
	}

    public void zipCodeSet(String zipCode)
	{
		this.zipCode = zipCode;
	}

	//-----------------------------

    public String mobileGet()
	{
		return this.mobile;
	}

    public void mobileSet(String mobile)
	{
		this.mobile = mobile;
	}






    public String getPostAddres()
	{
		return this.zipCode+this.addres;
	}






}

