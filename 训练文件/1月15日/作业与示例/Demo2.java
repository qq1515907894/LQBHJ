package day32;
import java.util.Arrays;
import java.util.Scanner;
public class Demo2 {
	//����һ����������������ȫ�������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//�ж�a�Ƿ��������
		if(a<=200 && a>=1){
			int[] arr=new int[a];
			//����forѭ��Ϊ���鸴��
			
			for(int i=0;i<a;i++){
				//2 6 8
				String a=sc.nextLine(); //2 3 6
				a.split(" ");
				
				
				//������̨��������������������и�ֵ������break
				if(sc.nextInt()<10000 && sc.nextInt()>-10000){
					arr[i]=sc.nextInt();
				}else{
					break;
				}
				//��ѭ���ɹ����е���a-1�Σ������һ�Σ�ִ���������
				if(i==a-1){
					Arrays.sort(arr);
					for(int j=0;j<a;j++){
						System.out.print(arr[j]+" ");
					}
				}
			}	
		}
	}
}