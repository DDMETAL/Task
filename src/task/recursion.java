	package task;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println(" ‰»În£∫\n");
		 int n=s.nextInt();
		 recursion(n);

	}
	public static void recursion(int n) {
		   if(n<5000) {
			   System.out.println(n);
			   recursion(n*2); //µ›πÈµ˜”√  
			   System.out.println(n);
		   }else if(n>5000){
			   
			   System.out.println(n);
			   System.out.println(n);
		   }
		  
		 }
		  
}