package Day6;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {

		/**
		 * 如果天气>=35 ,请你滚,你太热情,我接受不了 
		 * 如果天气>=30 <35 可以做个朋友 如果天气>=25 <30 我们出去玩吧
		 * 如果天气>=20 <25 我们出去嗨,慢慢细聊 
		 * 如果天气<20 天太冷,你的热度不够,暖不了我的心
		 * 
		 * 下去后用三目实现
		 * 
		 */
		/**
		 * 结构:
		 * if(条件){
		 * 	语句块
		 * }else if(条件){
		 * 	语句块
		 * }else if(条件){
		 * 	语句块
		 * }else {
		 * 	语句块
		 * }
		 * 
		 */
		System.out.println("请输入天气");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a >= 35) {
			System.out.println("请你滚,你太热情,我接受不了");
		} else if (a >= 25 && a < 30) {
			System.out.println("可以做个朋友");
		} else if (a >= 20 && a < 25) {
			System.out.println("我们出去嗨,慢慢细聊");
		} else {
			System.out.println("天太冷,你的热度不够,暖不了我的心");
		}

	}
}
