package Day7;

public class Demo2 {

	public static void main(String[] args) {
		//判断月份的天数
		//1,3,5,7,8,10,12    31天
		//4,6,9,11         30天
		//2 ?  28 29
		int month=3;
		int year=2000;
		boolean bl=year % 4 == 0 && year % 100 != 0
		|| year % 400 == 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"月有31天");
			break;//停止
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"月有30天");
			break;
		case 2:
			if (bl) {
				System.out.println(month+"月有29天");
			}else {
				System.out.println(month+"月有28天");
			}
			break;
		
		}
		
		
		
	}
}
