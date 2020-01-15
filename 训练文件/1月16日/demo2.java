package day_0116;
import java.util.Scanner;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		String ssr="";
		int r=ss.nextInt();
		for (int i = 0; i < r; i++) {
			int sr=ss.nextInt();
			ssr+=sr;
		}
		String con = ss.next();
		System.out.println(ssr.indexOf(con)+1);
	}

}
