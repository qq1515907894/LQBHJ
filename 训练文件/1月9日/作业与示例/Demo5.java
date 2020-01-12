package Day8;

public class Demo5 {

	public static void main(String[] args) {

		int num = 100;
		int j = 0;
		while (num <= 999) {
			int gw = num % 10;
			int sw = num / 10 % 10;
			int bw = num / 100 % 10;
			if (gw * gw * gw + sw * sw * sw + bw * bw * bw == num) {
				System.out.println(num + "是水仙花数");
				j++;
			}
			num++;
		}
		System.out.println("水仙花数共有" + j + "个");

	}
}
