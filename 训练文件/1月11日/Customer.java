package day_0111;
import java.util.Scanner;
public class Customer {
		String name;
		int age;
		String phone;
		double money;
		String user;
		String pass;
		Scanner ss = new Scanner(System.in);
		public String buy(){
			System.out.println(name+"购买成功，需付款10元,是否支付(Y/N)");
			return ss.next();
		}
		public double pay(){
			System.out.println(money-10);
			return money-10;
		}
		public void show(){
			System.out.println(name+"的个人信息为：\n姓名:"+name+"\n年龄"+age+"\n余额:"+money);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		c1.name="李四";
		c2.name="王五";
		c1.age=18;
		c2.age=25;
		c1.money=123.25;
		c2.money=666.25;
		c1.user="lishi";
		c2.user="wangwu";
		c1.pass="112233";
		c2.pass="778899";
		if ("Y".equals(c1.buy())) {
			System.out.println("购买成功，您的余额为：");
			c1.money=c1.pay();
			System.out.println("系统校验客户1的剩余金额为："+c1.money);
			c1.show();
			c2.show();
		}else {
			System.out.println("本次交易结束，您未购买任何物品，余额为："+c1.money);
			c1.show();
			c2.show();
		}

	}

}
