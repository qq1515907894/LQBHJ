package 蓝桥杯暑假;

public class day_0109_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 999; i++) {

		int a =i%10;
		int b =i%100/10;
		int c =i/100;
		if (a*a*a+b*b*b+c*c*c==i) {
			System.out.print(i+" ");
		}
		}
	}

}
