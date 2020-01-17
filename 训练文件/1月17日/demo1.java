package day_0117;

public class demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 32; i++) {
			String s = Integer.toBinaryString(i);
			for (int j = 0; j < 5-s.length(); j++) {
				System.out.print("0");
			}
			System.out.println(s);
		}

	}
}