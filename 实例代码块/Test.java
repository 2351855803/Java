public class Test
{

	{
	   System.out.println("ʵ�������鱻���ã�������");
	}


    public static void main(String[] args)
	{

		Test.JingTai();


		Test t1 = new Test();
		t1.ShiLi();


	
	
	}



	public Test()
	{
		System.out.println("���췽����ʹ��");
	}

	public Test(String name)
	{
		System.out.println("----------------" + name);
	}

	public void ShiLi()
	{
		System.out.println("ʵ������������");
	}

	public static void JingTai()
	{
		System.out.println("��̬����������");
	}




}


/*

��̬����������
ʵ�������鱻���ã�������
���췽����ʹ��
ʵ������������


======================ʵ��������ֻ����new����ű�ʹ��
*/