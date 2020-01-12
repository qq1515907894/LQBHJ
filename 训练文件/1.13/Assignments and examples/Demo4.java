package Day16;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		//从控制台输入1-5,存入数组中,并计算其之和
		//提示?循环
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);
		
		
		
	}
}
