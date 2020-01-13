package day32;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	//不输出不符合条件的数，输出其他符合条件的数
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//判断a是否符合条件
		if(a<=200 && a>=1){
			//将控制台输入的一串数字作为字符串，赋值给String变量aa
			Scanner sc1=new Scanner(System.in);
			String aa=sc1.nextLine();
			//以空格分割字符串，赋值进数组arr
			String[] arr=aa.split(" ");
			//用for循环强转String为int，同时为数组arr赋值
			int[] s=new int[a];
			for(int i=0;i<a;i++){
				s[i]=Integer.parseInt(arr[i]);
			}
			//数组排序
			Arrays.sort(s);
			//for循环遍历数组s，若符合条件则输出，否则不输出
			for(int i=0;i<a;i++){
				if(s[i]>=10000 || s[i]<=-10000){
					System.out.print("");
				}else{
					System.out.print(s[i]+" ");
				}
			}
		}
	}
}