package day_0117;
import java.util.Arrays;
import java.util.Scanner;
public class demo4 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int sr[]=new int[3];
		sr[0]=ss.nextInt();
		sr[1]=ss.nextInt();
		sr[2]=ss.nextInt();
		Arrays.sort(sr);
		System.out.println(sr[0]+" "+sr[1]+" "+sr[2]);
	}

}
