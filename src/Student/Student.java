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
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"ѧ����"+education);
	}
}

