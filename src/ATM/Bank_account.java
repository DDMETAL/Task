package ATM;

import java.util.Scanner;

class DepositAccount{
	int account;//�˺�
	String name;//����
	double balance;//���
	int deposit;//���
	static double interest_rate=0.023;
	//�˻���Ϣ
	public void setaccountinfo(int account,String name,double balance) {
		this.account=account;
		this.name=name;
		this.balance=balance;
	}
	//����
	public void Createaccount() {
		System.out.println("����������");
		Scanner scan = new Scanner(System.in);
		name=scan.next();
		account=(int)(Math.random()*90000+10000);
		System.out.println("������"+name);
		System.out.println("�����ʺ�Ϊ��"+account);
		System.out.println("����");
		balance=scan.nextInt();
		
		
	}
	//���
	public double deposit(int deposit) {
		balance=deposit+balance;
		return balance;
	}
	//����Ϣ
	public double interests(double balance) {
		return interest_rate*balance;
	}
	//����Ϣ
	public double interest(double balance) {
		return interest_rate*balance/12;
	}
	//���
	void display() {
		System.out.println("�˺ţ�"+account+"\n"+"������"+name+"\n"+"��"+balance);
		System.out.println("����Ϣ��"+interest_rate*balance);
		System.out.println("����Ϣ��"+interest_rate*balance/12);
		
	}
}

