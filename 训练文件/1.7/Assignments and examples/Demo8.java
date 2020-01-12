package Day6;

import java.util.Random;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// 随机数 random对象
		// 创建随机数对象 rd
		// 方法一:
		Random rd = new Random();
		// 定义变量去接受生成的随机数
		int a = rd.nextInt(43);// [0,43)
		System.out.println(a);
		// 方法二:
		// 如果括号里没有参数,他默认生成的[0,1)
		//因为他是一个静态方法,所以不用new
		int b1 = (int)(Math.random()*43);
		System.out.println("b:" + b1);
	}
}
