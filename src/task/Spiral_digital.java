package task;

import java.util.Scanner;

public class Spiral_digital {
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.println("��������������Ĳ�����\n");
		int n=s.nextInt();
		int tempN=n;
		int[][] arr=new int[n][n];
		int num=0,nn=1;
		//����ά����ĸ���Ԫ�ظ�ֵΪ0
		for(int i=0;i<n;i++){//����
			for(int j=0;j<n;j++){//����
				arr[i][j]=0;
			}
			System.out.println();//ÿn�л���
		}
	while(n>0){
		if(n==1)
			arr[num][num]=nn;
			arr[num][num]=nn;
		if(n>1){
				//arr[num+1][num]=4*n-5+arr[num][num];
			for(int i=num,j=num+1;j<num+n;j++) {//�ϱߺ���
				arr[i][j]=arr[num][num]+j-num;
			}
			for(int j=num+n-1,i=num+1;i<num+n;i++){//�ұ�����
				arr[i][j]=arr[i-1][j]+1;
			}
			for(int i=num+n-1,j=n+num-2;j>=num;j--){//�������
				arr[i][j]=arr[i][j+1]+1;
			}
			for(int j=num,i=num+n-2;i>num;i--){//��������
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
		for(int i=0;i<tempN;i++){//�����������
			for(int j=0;j<tempN;j++){
				System.out.print(arr[i][j]+"\t");
			}	
			System.out.println();
		}
		
		
	}

}
