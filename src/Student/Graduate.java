package Student;
public class Graduate extends Student{
	String direction;
	public Graduate(String name,int age,String education,String direction) {
		super(name,age,education);
		this.direction=direction;
	}
	public void show() {
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"ѧ����"+education+"\n"+"�о�����"+direction);
	}
 
}
