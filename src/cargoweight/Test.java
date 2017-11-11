package cargoweight;

public class Test {

	public static void main(String[] args) {
		ComputeWeight[] com1=new ComputeWeight[10];
		ComputeWeight[] com2=new ComputeWeight[20];
		for(int i=0;i<com1.length;i++) {
			if(i%3==0) {
				com1[i]=new Television();
			}
			if(i%3==1) {
				com1[i]=new Computer();
			}
			if(i%3==2) {
				com1[i]=new WashMachine();
			}
		}
		for(int i=0;i<com2.length;i++) {
			if(i%3==0) {
				com2[i]=new Television();
			}
			if(i%3==1) {
				com2[i]=new Computer();
			}
			if(i%3==2) {
				com2[i]=new WashMachine();
			}
		}
		Car bigc=new Car(com1);
		System.out.println("bigcar:"+bigc.gettotalWeight());
		Car smallc=new Car(com2);
		System.out.println("smallcar:"+smallc.gettotalWeight());

	}

}
