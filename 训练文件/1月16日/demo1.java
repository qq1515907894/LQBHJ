package day_0116;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		int num[][]=new int [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j]=ss.nextInt();
			}
		}
		if (num[0][0]+num[0][1]+num[0][2]==num[0][0]+num[1][0]+num[2][0]&&
				num[0][0]+num[1][0]+num[2][0]==num[0][0]+num[1][1]+num[2][2]) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
