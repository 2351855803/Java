public class Account
{   


	//�˻�id
	private String id;
	//���
	private double balance;
	//������
	private double nianLiLv;
    





	//�˻����ԵĻ�ȡ
	public String idGet()
	{
		return id;
	}
	//�˻����Ե��޸�
	public void idSet(String mingZi)
	{
		id = mingZi;
	}

	//-----------------------------------------

    //������ԵĻ�ȡ
	public double balanceGet()
	{
		return balance;
	}
	//������Ե��޸�
	public void balanceSet(double shengYu)
	{
		balance = shengYu;
	}


	//-----------------------------------------

    //���������ԵĻ�ȡ
	public double nianLiLvGet()
	{
		return nianLiLv;
	}
	//���������Ե��޸�
	public void nianLiLvSet(double liLv)
	{
		nianLiLv = liLv;
	}


    //-----------------------------------------
	//����ȡ��ķ���
	public void quKuan(double qu)
	{   System.out.println("-----------------------");
		System.out.println("��ǰ��" + this.balance);
		if(qu > balance)
		{
			System.out.println("���㣬ȡ��ʧ�ܣ�������������������");
			return;
		}
		balance = balance - qu;
		System.out.println("ȡ��ɹ�����");
		System.out.println("ȡ�����" + this.balance);
		System.out.println("-----------------------");

		

	}

  
    //-----------------------------------------
	//���ô��ķ���

	public void cunKuan(double cun)
	{ 
		System.out.println("-----------------------");
		System.out.println("��ǰ��" + this.balance);
		balance = balance + cun;
		System.out.println("���ɹ�����");
		System.out.println("������" + this.balance);
		System.out.println("-----------------------");
	}





}