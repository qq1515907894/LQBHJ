package day32;
import java.util.Scanner;
public class Demo5 {
	public static void main(String[] args) {
		//定义int型变量m接收控制台传来的数字
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		//定义一个二维数组，一维和二维长度均为m
		int [][]a=new int[m][m];
		//利用嵌套for循环为二维数组赋值
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
		//利用嵌套for循环遍历输出二维数组
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a[i][j]+" ");
			}
			//当一个小循环结束时代表该行结束，换行
			System.out.println();
		}
	}
}