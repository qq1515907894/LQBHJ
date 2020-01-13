package day_0114;
import java.util.Arrays;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int[] arr=new int[ss.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ss.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
