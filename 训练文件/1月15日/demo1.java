package day_0115;
import java.util.Scanner;
public class demo1 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int conout = ss.nextInt();
		int num [] = new int [conout];
		int max = -99999,min=99999,sum=0;
		for (int i = 0; i < conout; i++) {
			num[i]=ss.nextInt();
			sum+=num[i];
			if (num[i]>max) {
				max=num[i];
			}else if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(max+" "+min+" "+sum);
		
	}

}
