package Day12;

public class Demo4 {

	public static void main(String[] args) {
		// 3.无参有返回值的方法
		/**
		 * 返回值:String int boolean 对象 数组 .....
		 */
		Demo4 demo4 = new Demo4();
		// int num=demo4.f();//50
		// System.out.printf("我们班有%d人",num);
		System.out.printf("我们班有%d人", demo4.f());
	}

	// int是返回的数据类型 50 "Longjun"
	//返回类型是什么数据类型就一定要return什么数据类型
	public int f() {
		// 一定要有return
		return 51;
	}

}
