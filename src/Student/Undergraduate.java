package Student;
public class Undergraduate extends Student{
	String specialty;
	public Undergraduate(String name,int age,String education,String specialty) {
		super(name,age,education);
		this.specialty=specialty;
	}
	public void show() {
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"学历："+education+"\n"+"专业："+specialty);
	}
}

	