package day32;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args){
		//接收控制台传来的数字
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//根据题目要求，数字范围是五位数和六位数，故从10000开始循环到999999
		for(int i=10000;i<1000000;i++){
			//if语句将数字分为五位数和六位数两种类型
			if(i<100000){
				//类似于水仙花数，取得每一位上的数，若符合条件则输出
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10,w=(i/10000)%10;
				int sum1=g*10000+s*1000+b*100+q*10+w;
				int sum2=g+s+b+q+w;
				if(sum1==i && sum2==a){
					System.out.println(i);
				}
			}else{
				//大体思路和上边一样，这里因为是六位数，所以多一位数的取值
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10,w=(i/10000)%10,sw=(i/100000)%10;
				int sum1=g*100000+s*10000+b*1000+q*100+w*10+sw;
				int sum2=g+s+b+q+w+sw;
				if(sum1==i && sum2==a){
					System.out.println(i);
				}
			}
		}
	}
}