public class Test
{
	public static void main(String[] args)
	{

		Animal d = new Dog();
		Animal c = new Cat();



		d.doSome();
		c.doSome();

		System.out.println("---------------------");

		test(d);

		System.out.println("---------------------");
		
		test(c);
	
	}


//-------------------------------------------------------------------
	public static void test(Animal a)
	{

				                   //���������������еķ��� ����ת��
 
        if(a instanceof Dog)       //��Ϊ��֪��������������ʲô���͵�
		{ 
			Dog a1 = (Dog)a;      //ǿ������ת��
			a1.chiGuTou();
		}else if(a instanceof Cat)
		{
			Cat a1 = (Cat)a;
			a1.zhuaLaoShu();
		}

	}
}