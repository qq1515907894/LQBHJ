package day_0112;
import java.util.Scanner;
public class Calculator {
	int a,b;
	Scanner ss = new Scanner(System.in);
	public double add(double a,double b) {
	double result = a+b;
	return result;
	}
	public double sub(double a,double b) {
		double result = a-b;
		return result;
	}
	public double ride(double a,double b) {
		double result = a*b;
		return result;
	}
	public double rem(double a,double b) {
		double result = a/b;
		return result;
	}
	public double max(double a,double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	public double avg(double a,double b) {
		return add(a, b)/2;
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		Calculator cl = new Calculator();
		System.out.println("请输入第一个数：");
		int a=ss.nextInt();
		System.out.println("请输入第二个数：");
		int b=ss.nextInt();
		cl.a=a;cl.b=b;
		System.out.println("请输入运算规则："
				+ "\n1.加"
				+ "\n2.减"
				+ "\n3.乘"
				+ "\n4.除"
				+ "\n5.最大值"
				+ "\n6.平均值"
				+ "\n7.全部运算");
		switch (ss.nextInt()) {
		case 1:
			System.out.println("运算结果为："+cl.add(a, b));
			break;
		case 2:
			System.out.println("运算结果为："+cl.sub(a, b));
			break;
		case 3:
			System.out.println("运算结果为："+cl.ride(a, b));
			break;
		case 4:
			System.out.println("运算结果为："+cl.rem(a, b));
			break;
		case 5:
			System.out.println("运算结果为："+cl.max(a, b));
			break;
		case 6:
			System.out.println("运算结果为："+cl.avg(a, b));
			break;
		case 7:
			System.out.println("加法为："+cl.add(a, b));
			System.out.println("减法为："+cl.sub(a, b));
			System.out.println("乘法为："+cl.ride(a, b));
			System.out.println("除法为："+cl.rem(a, b));
			System.out.println("最大值为："+cl.max(a, b));
			System.out.println("平均值为："+cl.avg(a, b));
			break;
		default:
			System.out.println("输入错误！！！");
			break;
		}
	}

}
