public class Test1
{
	public static void main(String[] args)
	{
		Chinese c = new Chinese("����");
		c.sayWhat();
		American a = new American("Jack");
		a.sayWhat();



	}
}



class People
{


	private String name;




	//���췽��
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



    //��ʲô����
	public void sayWhat()
	{
		System.out.println(this.name + "............");

	}
}


//�й���
class Chinese extends People
{   
	//�޲���
	public Chinese()
	{

	}
	//�в���
	public Chinese(String name)
	{
		this.nameSet(name);
	}

    //��ʲô����
	public void sayWhat()
	{
		System.out.println(this.nameGet() + "������");

	}

}

//������
class American extends People
{   
	//�޲���
	public American()
	{

	}
	//�в���
	public American(String name)
	{
		this.nameSet(name);
	}

    //��ʲô����
	public void sayWhat()
	{
		System.out.println(this.nameGet() +" " + "speak english");

	}

}