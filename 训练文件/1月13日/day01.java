package day_0113;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] CLage = {18,19,16,17,18,17,19,20,18,17};
		int avg = 0;
		for (int i = 0; i < CLage.length; i++) {
			avg+=CLage[i];
		}
		System.out.println("平均年龄为："+avg/10+"岁");
	}

}
