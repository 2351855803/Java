public class User
{
	public static void main(String[] args)
	{
		Account zhanghu = new Account();

		//�˻�����
		zhanghu.idSet("1000");
		//�˻���ȡ
		System.out.println("�˻�Ϊ��" + zhanghu.idGet());


		//�������
		zhanghu.balanceSet(2000);
		//����ȡ
		System.out.println("���Ϊ��" + zhanghu.balanceGet());


		//����100
		zhanghu.cunKuan(100);
		System.out.println("�������Ϊ��" + zhanghu.balanceGet());

		//ȡ960
		zhanghu.quKuan(960);
		System.out.println("ȡ������Ϊ��" + zhanghu.balanceGet());

		//ȡ2000
		zhanghu.quKuan(2000);
		





	}
}