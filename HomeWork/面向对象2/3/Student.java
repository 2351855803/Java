public class Student
{
	//����
	private String name;
	//����
	private int age;
	//��ַ
	private String addres;
	//�ʱ�
	private String zipCode;
	//�ֻ�
	private String mobile;

    
	 
	//�޲������췽��
	public Student()
	{

	}
    
	//�в������췽��
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

