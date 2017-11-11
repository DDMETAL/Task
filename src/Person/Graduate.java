package Person;

public class Graduate implements StudentManage,TeacherManage {
	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
	
	public Graduate(String name, String sex, int age, double fee, double pay) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFee(double fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public double getPay() {
		return pay;
	}

}
