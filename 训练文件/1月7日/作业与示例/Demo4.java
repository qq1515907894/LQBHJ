package Day6;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {

		/**
		 * 1.条件语句 2.循环
		 */

		// 程序
		/**
		 * 按顺序执行 按条件执行 1.单分支结构 2.多分支结构 3.嵌套结构
		 */
		/*
		 * 1.单分支结构 结构: if(条件/true/false){ 语句块 }
		 */
		System.out.println("请输入天气");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		if (a >= 25) {
			System.out.println("今天太热我不想和你出去玩");
		}
		if (a < 25) {
			System.out.println("我不喜欢你!我只喜欢蒲老师");
		}

	}
}
