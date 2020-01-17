package day_0117;
import java.util.Scanner;
public class demo5 {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int ride(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		switch (ss.next()) {
		case "+":
			System.out.println(add(ss.nextInt(),ss.nextInt()));
			break;
		case "-":
			System.out.println(sub(ss.nextInt(),ss.nextInt()));
		case "*":
			System.out.println(ride(ss.nextInt(),ss.nextInt()));
		case "/":
			System.out.println(div(ss.nextInt(),ss.nextInt()));
		default:
			System.out.println("您的输入格式有误");
			break;
		}
	}

}
