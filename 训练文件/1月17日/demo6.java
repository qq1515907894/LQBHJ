package day_0117;
import java.util.Scanner;
public class demo6 {
	public static int CompactIntegers(int sr[],int num) {
		int con=0;
		for (int i = 0; i < sr.length; i++) {
			for (int j = 0; j < sr.length; j++) {
				if (sr[i]==0 &&i+j<num) {
					sr[i]=sr[i+j];
					sr[i+j]=0;
				}

			}
		}
		for (int i = 0; i < sr.length; i++) {
			if (sr[i]==0) {
				con++;
			}
		}
		return num-con;
	}
	public static void main(String[] args) {
		//这个题用列表应该简单，用数组好麻烦
		Scanner ss = new Scanner(System.in);
		int sr[]=new int [ss.nextInt()]; 
		for (int i = 0; i < sr.length; i++) {
			sr[i]=ss.nextInt();
		}
		int ssr=CompactIntegers(sr,sr.length);
		System.out.println(ssr);
		for (int i = 0; i < ssr; i++) {
			System.out.print (sr[i]+" ");
		}
	}

}
