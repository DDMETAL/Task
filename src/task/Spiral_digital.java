package task;

import java.util.Scanner;

public class Spiral_digital {
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.println("请输入螺旋矩阵的层数：\n");
		int n=s.nextInt();
		int tempN=n;
		int[][] arr=new int[n][n];
		int num=0,nn=1;
		//将二维数组的各个元素赋值为0
		for(int i=0;i<n;i++){//行数
			for(int j=0;j<n;j++){//列数
				arr[i][j]=0;
			}
			System.out.println();//每n列换行
		}
	while(n>0){
		if(n==1)
			arr[num][num]=nn;
			arr[num][num]=nn;
		if(n>1){
				//arr[num+1][num]=4*n-5+arr[num][num];
			for(int i=num,j=num+1;j<num+n;j++) {//上边横着
				arr[i][j]=arr[num][num]+j-num;
			}
			for(int j=num+n-1,i=num+1;i<num+n;i++){//右边竖着
				arr[i][j]=arr[i-1][j]+1;
			}
			for(int i=num+n-1,j=n+num-2;j>=num;j--){//下面横着
				arr[i][j]=arr[i][j+1]+1;
			}
			for(int j=num,i=num+n-2;i>num;i--){//左面竖着
				arr[i][j]=arr[i+1][j]+1;
			}
		}
		else {
			break;
		}
		nn+=4*n-4;
		n=n-2;
		num++;
		}
		for(int i=0;i<tempN;i++){//遍历输出矩阵
			for(int j=0;j<tempN;j++){
				System.out.print(arr[i][j]+"\t");
			}	
			System.out.println();
		}
		
		
	}

}
