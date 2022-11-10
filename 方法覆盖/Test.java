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
	System.out.println("动物在奔跑");
   }

}


class Cat extends Animal
{
   public void doSome()
   {
	System.out.println("猫在跳跃！！！！！！！！");
   }
}