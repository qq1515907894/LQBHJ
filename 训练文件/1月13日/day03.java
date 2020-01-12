package day_0113;
import java.util.Scanner;
public class day03 {

	public static void main(String[] args) {
		System.out.println("请输入30个姓名：");
		Scanner ss = new Scanner(System.in);
		String cl[][] = new String[3][10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				cl[i][j]=ss.next();
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"班");
			for (int j = 0; j < 10; j++) {
				System.out.print(cl[i][j]+" ");
			}
			System.out.println();
		}
	}

}
