package Person;
/**
 * ��Ҫ�����������о����¹��ʼ�ѧ��ѧ��
 * �����깤����ѧ��ѧ��
 * ���������С��2000
 * ���о��������
 * @author ��1501�� 1508010132 �¶�
 * @version 0.1
 */
public class Test {
	public static void main(String[] args) {
		//��������
		Graduate g=new Graduate("zhangsan", "��", 27, 8000, 11000);
		//��ȡ������ѧ�Ѳ��Ƚ�
		if(g.getPay()*12-g.getFee()*2<2000) {
			System.out.println("provide a loan");
		}else {
			System.out.println("!");
		}
	}
	
}
