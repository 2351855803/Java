public class Test
{
	public static void main(String[] args)
	{

	Cat c = new Cat();
	c.doSome();

	}
	


}

class Animal
{
   public void doSome()
   {
	System.out.println("�����ڱ���");
   }

}


class Cat extends Animal
{
   public void doSome()
   {
	System.out.println("è����Ծ����������������");
   }
}