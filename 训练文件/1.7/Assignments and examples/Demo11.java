package Day6;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println(year);
		System.out.println("请输入月分");
		int month = scanner.nextInt();
		System.out.println(month);

		// 判断是否为闫年,如果是返回true
		boolean bl = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		// 定义一个变量天数
		int day;
		if (month == 2) {
			if (bl) {
				day = 29;
			} else {
				day = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;// 如果不是2月份
		} else {
			day = 31;
		}
		System.out.println("你输入的年份" + year + "的" + month + "月有" + day + "天");

	}
}
