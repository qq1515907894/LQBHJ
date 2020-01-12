package Day6;

public class Demo1 {
	public static void main(String[] args) {
		// 多目运算
		// 水仙花数,3位,后期,>=3位
		// 复合运算
		int a = 1;
		a++;
		++a;
		System.out.println(a);

		// 0 2 4 6 8
		// 0 3 6 9 12
		int b = 0;
		b += 2; // b=b+2
		b += 2;
		System.out.println(b);
		// + - * / %
		int c = 10;
		c -= 6;// c=c-6
		System.out.println(c);
		int d = 20;
		d *= 2;
		System.out.println(d);
		int e = 3;
		e /= 6;
		System.out.println(e);
		int f = 20;
		f %= 3;
		System.out.println(f);
	}
}
