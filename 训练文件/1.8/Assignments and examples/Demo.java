package Day7;

public class Demo {

	public static void main(String[] args) {
		//条件判断语句  
		//if if else   多重IF else
		
		//swith case   
		/*
		double money=100000;
		if (money>=200000  && money<=300000) {
			System.out.println("我要买车");
		}else if(money>=300000  && money<=400000){
			System.out.println("我要买个房");
			
		}else  if(money>400000  ){
			System.out.println("我要娶个白富美");
		}else {
			System.out.println("只能娶个寡妇!");
		}
		*/
		
		//特点,缺点:罗搜,看着不爽
		
		//注意,比赛的时候用的是JKD1.6     int char
		//平时我们开发用的JKD比较多是的1.7  int char String
		//key:放的int,char String
		//default语句是可省略,break是不可以省略
		//不同if和swithc case的区别
		/**
		 * 只能处理等值条件判断的情况，
		 * 且条件必须是整型变量、字符型变量或字符串
		 * if语句
		 * 没有switch选择结构的限制，
		 * 特别适合某个变量处于某个连续区间时的情况


		 */
		
		int money1=210000;
		switch (money1) {
		case 500000:
			System.out.println("我要娶白富美 ");
			break; //一定有要,不能省,打断,停止
		case 400000:
			System.out.println("我要买房 ");
			break;
		case 300000:
			System.out.println("我要买车 ");
			break;
		case 200000:
			System.out.println("我要睡觉 ");
			break;
			
		default:
			System.out.println("死了算了 ");
			break;
		}
		
		
		
		
		
	}
}
