package ATM;

import java.util.Scanner;

class DepositAccount{
	int account;//账号
	String name;//姓名
	double balance;//余额
	int deposit;//存款
	static double interest_rate=0.023;
	//账户信息
	public void setaccountinfo(int account,String name,double balance) {
		this.account=account;
		this.name=name;
		this.balance=balance;
	}
	//开户
	public void Createaccount() {
		System.out.println("请输入姓名");
		Scanner scan = new Scanner(System.in);
		name=scan.next();
		account=(int)(Math.random()*90000+10000);
		System.out.println("姓名："+name);
		System.out.println("您的帐号为："+account);
		System.out.println("请存款");
		balance=scan.nextInt();
		
		
	}
	//余额
	public double deposit(int deposit) {
		balance=deposit+balance;
		return balance;
	}
	//年利息
	public double interests(double balance) {
		return interest_rate*balance;
	}
	//月利息
	public double interest(double balance) {
		return interest_rate*balance/12;
	}
	//输出
	void display() {
		System.out.println("账号："+account+"\n"+"姓名："+name+"\n"+"余额："+balance);
		System.out.println("年利息："+interest_rate*balance);
		System.out.println("月利息："+interest_rate*balance/12);
		
	}
}

