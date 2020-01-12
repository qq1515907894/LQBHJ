package Day6;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {

		// 闫年和平年
		//
		/**
		 * 1.能被4整除,但不能被100整除
		 *  year%4==0 && year%100!=0 
		 *  2. 能被400整除 
		 *  year%400==0
		 */
		System.out.println("请输入年份");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String yearString;
		yearString = (year % 4 == 0 && year % 100 != 0) 
				|| year % 400 == 0 
				? "闫年"
				: "平年";

		System.out.println("你输入的年份"
				+year+"是"+yearString);

	}
}
