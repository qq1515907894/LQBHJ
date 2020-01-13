package day32;
import java.util.Arrays;
import java.util.Scanner;
public class Demo2 {
	//若有一个数不符合条件，全部不输出
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//判断a是否符合条件
		if(a<=200 && a>=1){
			int[] arr=new int[a];
			//利用for循环为数组复制
			
			for(int i=0;i<a;i++){
				//2 6 8
				String a=sc.nextLine(); //2 3 6
				a.split(" ");
				
				
				//若控制台输入的数组符合条件则进行赋值，否则break
				if(sc.nextInt()<10000 && sc.nextInt()>-10000){
					arr[i]=sc.nextInt();
				}else{
					break;
				}
				//若循环成功进行到第a-1次，即最后一次，执行排序并输出
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