package Day11;

public class UseTeacherClass {

	//使用定义的类,要在main方法里用
	public static void main(String[] args) {
		//类是抽象出来的
		//要使用的话就要把它实例化,具体出来
		//实例化就是创建对象 平时我们也叫new一个对象出来
		Teacher longjun =new Teacher();
		//给对象的属性赋值
		longjun.name="Longjun";
		longjun.QQ="0101001";
		longjun.ahString="开车";
		longjun.telString="18132211823";
		//输出对象的属性
		System.out.println(longjun.name);
		System.out.println(longjun.QQ);
		
		//调方法
		longjun.kc();
		longjun.dr();
		
		
		
	}
	
}
