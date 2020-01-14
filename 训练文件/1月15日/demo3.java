package day_0115;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		System.out.println("请问打印多少行杨辉三角：");
		Scanner ss = new Scanner(System.in);
		int yh[][] = new int[100][100];
		int a = 1;
		int con=ss.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					yh[i][j] = 1;
				} else {
					yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];	//没想到我写的和demo有异曲同工之妙......
				}
				yh[a][j + 1] = 1;
				System.out.print(yh[i][j] + " ");
				if (a < con) {	//控制行数
					a++;
				}
			}
			System.out.println();
		}
	}
}
