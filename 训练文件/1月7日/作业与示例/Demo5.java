package Day6;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		/**
		 * 多分支结构
		 */
		System.out.println("请输入天气");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		if (a>=30) {
			System.out.println("天太热,对不起,上帝不帮忙");
		} else {
			System.out.println("天气不错,晚上可以考虑一下的");
		}
		
	}
}
