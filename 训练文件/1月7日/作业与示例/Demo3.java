package Day6;

public class Demo3 {
	public static void main(String[] args) {

		// 数据类型的转换
		// 8大 基本数据类型
		// 整型:byte short int long
		// 浮点型:float double
		// 字符型:char
		// 布尔型:boolean

		// 字符串:String 引用类型
		
		int a1=10;
		double b1=10.5;
		//小的数据类型加大的数据类型等大的数据类型
		//自动转换
		System.out.println(a1+b1);
		//double b1=10.5;能否转成int型
		//强制转换 ,缺点,丢失精度
		int a2=(int)b1;
		System.out.println(a2);
		
		//char类型可以转成int型,相加结果为int型
		int a = 2;
		char c = '男'; //! @ $ 
		// a+c
		System.out.println((int)c);
		System.out.println(c+a);
	
		//String 和int型相加呢
		//得到一个拼接字符串
		int d=5;
		String nameString="Longjun";
		System.out.println(nameString+d);
		char c1='女';
		System.out.println(nameString+c);
		
		
		//总结:
		/**
		 * 1.数据的基本类型
		 * 2.运算符
		 * 2.复合运算
		 * 3.三目
		 * 4.数据转换
		 */
		
		
		
		
		
		
	}
}
