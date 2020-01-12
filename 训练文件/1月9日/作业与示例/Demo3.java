package Day8;

public class Demo3 {

	public static void main(String[] args) {
		// 输出0到100的所有偶数
		int num = 0;
		while (num <= 100) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;

		}

		while (num <= 100) {
			System.out.println(num);
			num += 2;

		}

	}

}
