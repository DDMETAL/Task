package ATM;

class TestDepositAccount{
	public static void main(String[] args) {
		DepositAccount Account=new DepositAccount();
		Account.Createaccount();
		//Account.setaccountinfo(1234567890, "ZhangSan", 5000);
		Account.deposit(2000);
		Account.interests(2000);
		Account.interest(2000);
		Account.display();
	}

}
