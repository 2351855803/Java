public class Account
{   


	//账户id
	private String id;
	//余额
	private double balance;
	//年利率
	private double nianLiLv;
    





	//账户属性的获取
	public String idGet()
	{
		return id;
	}
	//账户属性的修改
	public void idSet(String mingZi)
	{
		id = mingZi;
	}

	//-----------------------------------------

    //余额属性的获取
	public double balanceGet()
	{
		return balance;
	}
	//余额属性的修改
	public void balanceSet(double shengYu)
	{
		balance = shengYu;
	}


	//-----------------------------------------

    //年利率属性的获取
	public double nianLiLvGet()
	{
		return nianLiLv;
	}
	//年利率属性的修改
	public void nianLiLvSet(double liLv)
	{
		nianLiLv = liLv;
	}


    //-----------------------------------------
	//设置取款的方法
	public void quKuan(double qu)
	{   System.out.println("-----------------------");
		System.out.println("当前余额：" + this.balance);
		if(qu > balance)
		{
			System.out.println("余额不足，取款失败！！！！！！！！！！");
			return;
		}
		balance = balance - qu;
		System.out.println("取款成功！！");
		System.out.println("取款后余额：" + this.balance);
		System.out.println("-----------------------");

		

	}

  
    //-----------------------------------------
	//设置存款的方法

	public void cunKuan(double cun)
	{ 
		System.out.println("-----------------------");
		System.out.println("当前余额：" + this.balance);
		balance = balance + cun;
		System.out.println("存款成功！！");
		System.out.println("存款后余额：" + this.balance);
		System.out.println("-----------------------");
	}





}