package day_0113;
import java.util.Scanner;
public class day02 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int age[]=new int[10];
		int min = 999,mini=0;
		
		System.out.println("请录入十个年龄");
		for (int i = 0; i < age.length; i++) {
			age[i]=ss.nextInt();
			if (age[i]<min) {
				min=age[i];
				mini=i;
			}
		}
		System.out.println("年龄最小的为："+min+"对应的数组下标为："+mini);
		int agetb;
		for (int i = 0; i < age.length; i++) {
			for (int j = i; j < age.length; j++) {
				if (age[j]>age[i]) {
					agetb = age[j];
					age[j]=age[i];
					age[i]=agetb;
				}
			}
			System.out.println("第"+(i+1)+"次排序结果为：");
			for (int k = 0; k < age.length; k++) {
				System.out.print(age[k]+" ");
			}
				System.out.println();
		}

	}

}
