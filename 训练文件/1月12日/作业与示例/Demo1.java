package Day12;

public class Demo1 {
	public static void main(String[] args) {

		// 可以对类定义属性和方法
		// 名词与动词
		// 方法
		/**
		 * 1.方法共有4种 有参数,有返回 有参数,无返回 无参数,有返回 无参数,无返回
		 */
		// 定义方法的位置,在main方法外,在类里
		// 用类创建一个对象,并调用类的方法
		Demo1 demo1 = new Demo1();
		demo1.f();

	}

	// 定义一个方法,实现99乘法表
	// 格式:public公共的, void是无返回值,f是方法名,括号里无参数
	// 1.无参无返回值的方法
	public void f() {
		// 方法里放着的就是我们的逻辑
		for (int i = 1; i <= 50; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
