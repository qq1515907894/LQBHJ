package day32;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args){
		//���տ���̨����������
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//������ĿҪ�����ַ�Χ����λ������λ�����ʴ�10000��ʼѭ����999999
		for(int i=10000;i<1000000;i++){
			//if��佫���ַ�Ϊ��λ������λ����������
			if(i<100000){
				//������ˮ�ɻ�����ȡ��ÿһλ�ϵ��������������������
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10,w=(i/10000)%10;
				int sum1=g*10000+s*1000+b*100+q*10+w;
				int sum2=g+s+b+q+w;
				if(sum1==i && sum2==a){
					System.out.println(i);
				}
			}else{
				//����˼·���ϱ�һ����������Ϊ����λ�������Զ�һλ����ȡֵ
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10,w=(i/10000)%10,sw=(i/100000)%10;
				int sum1=g*100000+s*10000+b*1000+q*100+w*10+sw;
				int sum2=g+s+b+q+w+sw;
				if(sum1==i && sum2==a){
					System.out.println(i);
				}
			}
		}
	}
}