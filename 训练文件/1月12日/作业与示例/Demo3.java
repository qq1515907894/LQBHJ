package Day12;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//2.有参无返回值的方法
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String studentName=scanner.next();
		System.out.println("请输入学生年龄:");
		int studentAge=scanner.nextInt();
		System.out.println("请输入老师姓名:");
		String teacherName=scanner.next();
		//创建对象
		Demo3 demo3=new Demo3();
		//调方法
		demo3.f(studentName, studentAge, teacherName);
		
	}
	
	public void f(String student,int age,String teacher){
		//"李朵"今年"18"岁,我"蒲老师"的酒徒
		System.out.printf("%s今年%d岁,是%s的酒徒",student
				,age,teacher);
	}
	
	
	
}
