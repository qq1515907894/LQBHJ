package day32;
import java.util.Scanner;
public class Demo5 {
	public static void main(String[] args) {
		//����int�ͱ���m���տ���̨����������
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		//����һ����ά���飬һά�Ͷ�ά���Ⱦ�Ϊm
		int [][]a=new int[m][m];
		//����Ƕ��forѭ��Ϊ��ά���鸳ֵ
		//[[1],[1,1],[1,2,1],[1,3,3,1]]
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				if(j==0){
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		//����Ƕ��forѭ�����������ά����
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+" ");
			}
			//��һ��Сѭ������ʱ������н���������
			System.out.println();
		}
	}
}