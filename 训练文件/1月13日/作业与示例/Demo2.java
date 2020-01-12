package Day16;

public class Demo2 {

	public static void main(String[] args) {
		
		//下标的问题
		//int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
		// 					  0 1 2 3 4 5 6 7 8 9			
		int[] arr=new int[6];
		//如:2 5 78 96 3 2 
		//长度-1=下标的最大值
		//赋值,下标从0开始
		arr[0]=2;
		arr[1]=5;
		arr[2]=78;
		arr[3]=96;
		arr[4]=3;
		arr[5]=2;
		//循环取值:用下标来取arr[i]
		for (int i = 0; i <6; i++) {
			System.out.println("下标为"+i+"的值为:"+arr[i]);
		}
		
		
		
	}
}
