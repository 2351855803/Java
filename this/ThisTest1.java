public class ThisTest1
{
	public static void main(String[] args)
	{
		User u = new User("张三");
		u.doWhat();
	}






}



class User
{

	String name;
	String zuoShenMe;




	public User()
	{
	}
	public User(String xingMing)
	{
		name = xingMing;
	}



	public void doWhat()
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入数字");
        int num = s.nextInt();
        
		//String zuoShenMe;
   
        if(num == 1)
		{
			zuoShenMe = "游泳";
		}else if(num == 2)
		{
			zuoShenMe = "篮球";
		}else if(num == 3)
		{
			zuoShenMe = "排球";
		}else
		{
			zuoShenMe = "非法输入！！！！！！！！";

		}
 


		System.out.println(this.name + "正在....." + zuoShenMe);
	}






}