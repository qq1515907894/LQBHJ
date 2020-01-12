package 蓝桥杯暑假;
import java.util.Scanner;
public class day_0108_01 {

	public static void main(String[] args) {
		System.out.println("		欢迎进入电子商务系统"
				+ "\n**************************************************"
				+ "\n\t\t1.查看商品"
				+ "\n\t\t2.我的购物车"
				+ "\n\t\t3.购物结算"
				+ "\n\t\t4.注销"
				+ "\n***************************************************");
		System.out.println("请输入选项：");
		Scanner xx = new Scanner(System.in);
		switch (xx.nextInt()) {
		case 1:
			System.out.println("查看商品>进入查看商品界面");
			break;
		case 2:
			System.out.println("查看商品>我的购物车");
			break;
		case 3:
			System.out.println("查看商品>购物结算");
			System.out.println("请输入所购商品的金额：");
			int money = xx.nextInt();
			System.out.println("请选择优惠换购活动：\r\n"
					+"1:对于单次消费满50元的顾客，加1元，可换购可口可乐一瓶；\r\n" + 
					"2:对于单次消费满100元的顾客，加2元，可换购洗洁精一瓶；\r\n" + 
					"3:消费满200元的顾客，加5元，可换购海飞丝洗发水一瓶；\r\n" + 
					"4:消费满300元以上，加10元，可换购伊利牛奶一箱\r\n"
					+ "0:不换购");
			System.out.println("请选择活动类型：");
			switch (xx.nextInt()) {
			case 1:
				if (money>=50) {
					System.out.println("成功换购：一瓶可口可乐");
					System.out.println("本次消费金额："+(money+1));
				}else {
					System.out.println("换购失败，您本次消费金额不足50");
				}
				break;
			case 2:
				if (money>=100) {
					System.out.println("成功换购：一瓶洗洁精");
					System.out.println("本次消费金额："+(money+2));
				}else {
					System.out.println("换购失败，您本次消费金额不足100");
				}
				break;
			case 3:
				if (money>=200) {
					System.out.println("成功换购：一瓶海飞丝洗发水");
					System.out.println("本次消费金额："+(money+5));
				}else {
					System.out.println("换购失败，您本次消费金额不足200");
				}
				break;
			case 4:
				if (money>=300) {
					System.out.println("成功换购：一箱伊利牛奶");
					System.out.println("本次消费金额："+(money+10));
				}else {
					System.out.println("换购失败，您本次消费金额不足300");
				}
				break;

			default:
				System.out.println("输入错误!!!");
				break;
			}
			break;
		case 4:
			System.out.println("系统已注销！");
		default:
			System.out.println("输入错误!!!");
			break;
		}
	}

}
