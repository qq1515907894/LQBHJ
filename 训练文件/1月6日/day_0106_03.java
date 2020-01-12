package 蓝桥杯暑假;

import java.util.Scanner;

public class day_0106_03 {
	public static void main(String[] args) {
		// 已知水仙花数为：153 370 371 407
		Scanner input = new Scanner(System.in);
		int sr = input.nextInt();
		if (sr == 153 || sr == 370 || sr == 371 || sr == 407) {
			System.out.println("此数是水仙花数");
		} else {
			System.out.println("此数不是水仙花数");
		}
	}
}
