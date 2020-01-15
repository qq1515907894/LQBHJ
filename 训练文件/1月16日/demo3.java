package day_0116;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		char con = 65;
		int []num=new int [24];
		Scanner ss = new Scanner(System.in);
		System.out.println("请输入要生成的列和行：");
		int n=ss.nextInt();int m=ss.nextInt();
		int a=0,b=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=65+i;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char)(num[i-j]));
				
			}
			for (int j = 0; j < m-i; j++) {
				a=0;
				System.out.print((char)(num[j+a]));
				a++;
			}
			System.out.println();
		}
		
	}

}
