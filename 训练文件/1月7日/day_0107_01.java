package 蓝桥杯暑假;
import java.util.Scanner;
public class day_0107_01 {

	public static void main(String[] args) {
		System.out.println("*****************************************"
				+ "\n\t1.系统登录"
				+ "\n\t2.退出登录"
				+ "\n*****************************************");
		int xz=xz();
		while (xz!=0) {
			xz();
			
		}
	}
public static int xz() {

	int flag=0;
	Scanner input = new Scanner(System.in);
	int sr = input.nextInt();
	if (sr==1) {
		System.out.println("请输入登录账号：");
		String user = input.next();
		System.out.println("请输入登录密码：");
		String password = input.next();
		if ("admin".equals(user)&&"123456".equals(password)) {
			System.out.println("登录成功");
			flag=0;
		} else {
			System.out.println("账号或密码错误,请重新选择!\r\n"
					+ "*****************************************" + 
					"\n\t1.系统登录" + 
					"\n\t2.退出登录\r\n" + 
					"*****************************************");
			flag=1;
			return flag;
		}
		
	} else if(sr==2) {
		System.out.println("您已成功退出");
	}else {
		if (flag==0) {
			System.out.println("输入错误,请重新输入：");
			flag=1;
		return flag;
		}	
	}
	return flag;
}

}
