public class Book
{


	//书名
	 private String title;
	//页数
	 private int pageNum = 200;



	//为书名赋值
	public void titleSet(String shuMing)
	{
		title = shuMing;
	}

	//读取书名
    public String titleGet()
	{
		return title;
	}





	//为页数赋值
	public void pageNumSet(int yeShu)
	{
		if(yeShu<200)
		{
			System.out.println("Error!!!!!");
		    return;
		}
		pageNum = yeShu;
	}

	//读取页数
    public int pageNumGet()
	{
		return pageNum;
	}
    

	//detail方法输出书名和页数
	public void detail()
	{
		System.out.println("书名为：" + this.title);
		System.out.println("页数为：" + this.pageNum);
	}




}