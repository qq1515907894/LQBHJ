package day_0117;
import java.util.Scanner;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = ss.nextInt();
		if (year%4==0&&year%100!=0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
