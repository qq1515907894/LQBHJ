package day_0111;
import java.util.Scanner;

import javax.swing.RootPaneContainer;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
public class Admin {
		String rtname;
		String rtuser;
		int token;
		String phone;
		Scanner ss = new Scanner(System.in);
		public String login(){
			System.out.println("请输入账号：");
			String user = ss.next();
			System.out.println("请输入密码：");
			int pass = ss.nextInt();
			return user+pass;
			
		}
		public void show(){
			System.out.println("\n姓名:"+rtname+"\n电话号码:"+phone);
		}

	public static void main(String[] args) {
		int flag = 0;  //0代表未登录
		Admin zs = new Admin();	
		
		zs.rtname="张三";
		zs.rtuser="admin";
		zs.token=123456;
		zs.phone="147852369";
		String back = zs.login();
		if ("admin123456".equals(back)) {
			flag = 1;
			System.out.print("登录成功，您的信息如下：");
			zs.show();
		}else {
			flag = 0;
			System.out.println("登录失败！！！");
		}	
	}
}
