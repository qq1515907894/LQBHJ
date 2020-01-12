package Day8;

import java.util.Random;

public class Demo4 {

	public static void main(String[] args) {
		
		/**
		 * do while
		 */
		
		//它跟while循环的本质区别是
		//while是先判断再执行
		//do while是先执行一次再判断,如果符合条件再执行,然后再决断
		//直到条件不成立
		
		
		int num;
		//18
		do {
			num=(int)(Math.random()*100);
			System.out.println(num);//50
			//语句块
			System.out.println("我可以恋爱了!!");
			
		} while (num<=42);//true //当条件为false时,循环结束
		
		
	}
}
