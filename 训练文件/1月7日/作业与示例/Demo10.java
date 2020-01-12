package Day6;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println(year);
		System.out.println("请输入月分");
		int month = scanner.nextInt();
		System.out.println(month);
		//2000
		//2
		//2018年2月有29天
		//1.判断年份是否为闫年,
		//如果为闫年2月有29天,否则为28天
		//
		//如果是闫年
		if ((year % 4 == 0 && year % 100 != 0) 
				|| year % 400 == 0) {
			if (month==1 || month==3 ||month==5 ||
				month==7 || month==8 ||month==10 ||
				month==12 ) {
				System.out.println(year+"的"+month+"月份有31天");
			}else if(month==4 || month==6 ||month==9 ||
					month==11 ){
				System.out.println(year+"的"+month+"月份有30天");
			}else{
				System.out.println(year+"的"+month+"月份有29天");
			}
			
			//不是闫年就是平年
		}else{
		
			if (month==1 || month==3 ||month==5 ||
					month==7 || month==8 ||month==10 ||
					month==12 ) {
					System.out.println(year+"的"+month+"月份有31天");
				}else if(month==4 || month==6 ||month==9 ||
						month==11 ){
					System.out.println(year+"的"+month+"月份有30天");
				}else{
					System.out.println(year+"的"+month+"月份有28天");
				}
			
		}
		
		
		
		
		
		
	}
}
