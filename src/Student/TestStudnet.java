package Student;

public class TestStudnet {

	public static void main(String[] args) {
		Student stu,stu1,stu2;
		//stu=new Student("张三",18,"本科");
		stu1=new Undergraduate("张三",18,"本科","软工");
		stu2=new Graduate("李四",20,"研究生","人工智能");
	//	stu.show();
		stu1.show();
		stu2.show();
		
	}

}
