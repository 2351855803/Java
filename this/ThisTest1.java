public class ThisTest1
{
	public static void main(String[] args)
	{
		User u = new User("����");
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
		System.out.print("��������");
        int num = s.nextInt();
        
		//String zuoShenMe;
   
        if(num == 1)
		{
			zuoShenMe = "��Ӿ";
		}else if(num == 2)
		{
			zuoShenMe = "����";
		}else if(num == 3)
		{
			zuoShenMe = "����";
		}else
		{
			zuoShenMe = "�Ƿ����룡��������������";

		}
 


		System.out.println(this.name + "����....." + zuoShenMe);
	}






}