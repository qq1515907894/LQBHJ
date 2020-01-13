package day32;

public class Demo4 {
	
	public static void main(String[] args) {
		//根据题目要求，数字范围是四位数，故从1000开始循环到9999
		for(int i=1000;i<10000;i++){
				//类似于水仙花数，取得每一位上的数，若符合条件则输出
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10;
				int sum1=g*1000+s*100+b*10+q;
				if(sum1==i){
					System.out.println(i);
			}
		}
	}
}