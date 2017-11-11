package Person;
/**
 * 主要功能是设置研究生月工资及学期学费
 * 计算年工资与学年学费
 * 若两者相差小于2000
 * 则研究生需贷款
 * @author 软工1501班 1508010132 陈栋
 * @version 0.1
 */
public class Test {
	public static void main(String[] args) {
		//创建对象
		Graduate g=new Graduate("zhangsan", "男", 27, 8000, 11000);
		//获取工资与学费并比较
		if(g.getPay()*12-g.getFee()*2<2000) {
			System.out.println("provide a loan");
		}else {
			System.out.println("!");
		}
	}
	
}
