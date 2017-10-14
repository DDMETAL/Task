package Student;

public class Student {
	String name;
	int age;
	String education;
	public Student(String name,int age,String education) {
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show() {
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"学历："+education);
	}
}

