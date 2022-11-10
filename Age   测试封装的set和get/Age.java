public class Age
{
	 private int age;





    public int getAge()
	{
		return age;
	}





	public void setAge(int nianLing)
	{
		if (nianLing<0 | nianLing>150)
		{
			System.out.println("ÄêÁä·Ç·¨£¡£¡£¡£¡");
			return;
		}
		age = nianLing;



	}








}