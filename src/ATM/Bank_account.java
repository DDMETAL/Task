package ATM;
class DepositAccount{
	int account;//�˺�
	String name;//����
	double balance;//���
	int deposit;//���
	static double interest_rate=0.023;
	//�˻���Ϣ
	void setaccountinfo(int account,String name,double balance) {
		this.account=account;
		this.name=name;
		this.balance=balance;
	}
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

