package day_0117;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int sr=ss.nextInt();
		int []arr=new int[sr];
		int []ssr=new int[sr];
		int count=0;int max=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ss.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j]==arr[i]) {
					count++;
				}
			}
			ssr[i]=count;
			if (count>max) {
				max=count;
			}
		}
		System.out.println(arr[max]);
	}

}
