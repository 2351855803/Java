public class SuperTest
{
	public static void main(String[] args)
	{
		
		Animal a = new Animal("Ð¡ºÚ");
        

		System.out.println(a.name);
        System.out.println("----------------------");
		

        Dog d = new Dog();
		System.out.println("----------------------");
		System.out.println(d.name);


	}
}


class Animal
{
	String name;

	public Animal()
	{

	}
	public Animal(String name)
	{
		this.name = name;
	}
}


class Dog extends Animal
{
	public Dog()
	{
		super("Ð¡°×");

	}
	public Dog(String name)
	{
		this.name = name;
		
	}

}