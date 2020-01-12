package Day11;

public class UseStudentCalss {

	public static void main(String[] args) {
		//创建对象
		Strudent XXBWL=new Strudent();
		//对象调初始化方法
		/**
		 * 注意,字符串的默认值是null
		 * 		int :0
		 * 		double:0.0
		 * 		boolean:false
		 */
		XXBWL.StrudentInfo();
		//代码是按顺序执行
		
		System.out.println("开始初始化");
		XXBWL.name="WL";
		XXBWL.age=30;
		XXBWL.ahString="老牛吃嫩草,越老越香";
		XXBWL.StrudentInfo();
		
		
		
	}
}
