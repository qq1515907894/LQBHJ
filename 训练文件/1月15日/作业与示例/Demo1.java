package day32;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	//����������������������������������������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//�ж�a�Ƿ��������
		if(a<=200 && a>=1){
			//������̨�����һ��������Ϊ�ַ�������ֵ��String����aa
			Scanner sc1=new Scanner(System.in);
			String aa=sc1.nextLine();
			//�Կո�ָ��ַ�������ֵ������arr
			String[] arr=aa.split(" ");
			//��forѭ��ǿתStringΪint��ͬʱΪ����arr��ֵ
			int[] s=new int[a];
			for(int i=0;i<a;i++){
				s[i]=Integer.parseInt(arr[i]);
			}
			//��������
			Arrays.sort(s);
			//forѭ����������s��������������������������
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