package Student;
public class Undergraduate extends Student{
	String specialty;
	public Undergraduate(String name,int age,String education,String specialty) {
		super(name,age,education);
		this.specialty=specialty;
	}
	public void show() {
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"ѧ����"+education+"\n"+"רҵ��"+specialty);
	}
}

	