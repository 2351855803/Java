public class Test
{
	public static void main(String[] args)
	{   
		
		
		/*
		Animal a = new Animal();      之前的写法
		Cat c = new Cat();
		Dog d = new Dog();
        */

		//使用了多态之后，由于cat dog 和animal有继承的关系
		

		Animal a = new Cat();
		Animal a1 = new Dog();
		a.doSome();
		a1.doSome();

		/*
		猫在跳
        狗在跑
		*/


	}
}