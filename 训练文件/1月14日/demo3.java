package day_0114;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo3 {
	// 5位数*五位数例：88888*88888=7,901,076,544大于int范围，所以用long
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		List<Long> list = new ArrayList<Long>();
		for (long l = 0; l < 5; l++) {
			long ii = ss.nextInt();
			for (long i = 10; i < ii; i++) { // 控制位数
				long con = i * i; // 平方
				long num = con % 100; // 最后两位
				list.add(num); // 列表加
				for (int j = 0; j < list.size() - 1; j++) { // 去重
					for (int j2 = list.size() - 1; j2 > j; j2--) {
						if (list.get(j) == list.get(j2)) {
							list.remove(j2);
						}
					}

				}
			}
			System.out.println(list.size());
		}
	}

}
/*平方末尾

能够表示为某个整数的平方的数字称为“平方数”
比如，25,64
虽然无法立即说出某个数是平方数，但经常可以断定某个数不是平方数。
因为平方数的末位只可能是：[0, 1, 4, 5, 6, 9] 这6个数字中的某个。
所以，4325435332必然不是平方数。

如果给你一个2位或2位以上的数字，你能根据末位的两位来断定它不是平方数吗？

请计算一下，一个2位以上的平方数的最后两位有多少种可能性？

注意：需要提交的是一个整数，表示2位以上的平方数最后两位的不同情况数。
不要填写任何多余内容（比如，说明解释文字等）*/