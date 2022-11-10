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

				                   //调用两个子类特有的方法 向下转型
 
        if(a instanceof Dog)       //因为不知道这两个引用是什么类型的
		{ 
			Dog a1 = (Dog)a;      //强制类型转换
			a1.chiGuTou();
		}else if(a instanceof Cat)
		{
			Cat a1 = (Cat)a;
			a1.zhuaLaoShu();
		}

	}
}