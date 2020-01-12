package Day12;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		//学习面象对象三大特性:封装,继承,多态
		// 2.有参无返回值的方法
		System.out.println("请输入一个值:");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		//创建对象
		Demo2 demo2=new Demo2();
		//int num2=50;
		//调方法,传入参数
		//f(num1)里num我们称为实际参数,也是实参
		demo2.f(num1);
		
	}
	//有参无返回值的方法
	//int num 中的num我们称它为:形式参数,也叫形参
	public void f(int num) {
		// 方法里放着的就是我们的逻辑
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

	}
	
	
}
