package Student;
public class Graduate extends Student{
	String direction;
	public Graduate(String name,int age,String education,String direction) {
		super(name,age,education);
		this.direction=direction;
	}
	public void show() {
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"学历："+education+"\n"+"研究方向："+direction);
	}
 
}
