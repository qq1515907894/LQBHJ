package Day11;

public class Strudent {
	// 学生类
	String name;
	int age;
	String ahString;

	//定义一个方法输出学生信息
	public void StrudentInfo()
	{
		//占位符 %s代表字符串,%d代表数字 printf
		System.out.printf("我的学生%s,他今年%d岁," +
				"他的爱好是%s",name,age,ahString);
	}
	
}
