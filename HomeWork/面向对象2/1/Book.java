public class Book
{


	//����
	 private String title;
	//ҳ��
	 private int pageNum = 200;



	//Ϊ������ֵ
	public void titleSet(String shuMing)
	{
		title = shuMing;
	}

	//��ȡ����
    public String titleGet()
	{
		return title;
	}





	//Ϊҳ����ֵ
	public void pageNumSet(int yeShu)
	{
		if(yeShu<200)
		{
			System.out.println("Error!!!!!");
		    return;
		}
		pageNum = yeShu;
	}

	//��ȡҳ��
    public int pageNumGet()
	{
		return pageNum;
	}
    

	//detail�������������ҳ��
	public void detail()
	{
		System.out.println("����Ϊ��" + this.title);
		System.out.println("ҳ��Ϊ��" + this.pageNum);
	}




}