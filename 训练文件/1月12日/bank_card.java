package day_0112;
import java.util.Scanner;
public class bank_card {
	String id;
	String name;
	String man_name;
	double money;
	public Double add(Double money) {
		System.out.println("请问存入多少钱：");
		double add = ss.nextDouble();
		money += add;
		return money;
	}
	public Double sub(Double money) {
		System.out.println("请问取出多少钱：");
		double add = ss.nextDouble();
		if (money - add>0) {
			money -= add;
		}else {
			return -1.0;
		}
		return money;
		
	}
	public void sel() {
		System.out.println("您的余额为："+money);
	}
	Scanner ss = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		// TODO Auto-generated method stub
		bank_card bk = new bank_card();
		bk.man_name="张三";
		bk.id="6217521598752362";
		bk.name="农业银行";
		bk.money=123456.78;
		boolean flag = true;
		while (flag) {
			System.out.println("**********************************"
					+ "\n请输入您要办理的业务"
					+ "\n1.存款"
					+ "\n2.取款"
					+ "\n3.查询余额"
					+ "\n4.退出"
					+ "\n**********************************");
			switch (ss.nextInt()) {
			case 1:
				bk.money=bk.add(bk.money);
				System.out.println("存入成功，余额为："+bk.money);
				break;
			case 2:
				double money = bk.sub(bk.money);
				if (money!=-1.0) {
					bk.money= money;
					System.out.println("取出成功，余额为："+bk.money);
				}else {
					System.out.println("取出失败，原因：余额不足，未做变动");
					bk.sel();
				}	
				break;
			case 3:
				bk.sel();
				break;
			case 4:
				System.out.println("退出成功");
				flag = false;
				break;
			default:
				System.out.println("您输入错误，请重新输入");
				break;
			}	
		}
	}
}
