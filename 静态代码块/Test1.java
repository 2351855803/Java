public class Test1
{
   
  /*

    static
	{
		System.out.println(name);
	}

	static String name;

                         ----------->  非法前相引用
  */

    static String name;
    static
	{
		System.out.println(name);
	}

	








	public static void main(String[] args)
	{}
}