package day32;

public class Demo4 {
	
	public static void main(String[] args) {
		//������ĿҪ�����ַ�Χ����λ�����ʴ�1000��ʼѭ����9999
		for(int i=1000;i<10000;i++){
				//������ˮ�ɻ�����ȡ��ÿһλ�ϵ��������������������
				int g=i%10,s=(i/10)%10,b=(i/100)%10,q=(i/1000)%10;
				int sum1=g*1000+s*100+b*10+q;
				if(sum1==i){
					System.out.println(i);
			}
		}
	}
}