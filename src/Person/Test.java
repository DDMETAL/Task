package Person;

public class Test {
	public static void main(String[] args) {
		Graduate g=new Graduate("zhangsan", "ÄÐ", 27, 8000, 11000);
		if(g.getPay()*12-g.getFee()*2<2000) {
			System.out.println("provide a loan");
		}else {
			System.out.println("!");
		}
	}
	
}
