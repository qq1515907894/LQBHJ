package Day16;
//import是导包的意思,util是我们的常工具包,
import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] arr=new int[]{1,25,2,3,21,48,9,6,7,8,9,10,12};
		//请问数据的长度是多少?
		//属性或方法 length 获取长度的方法
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//倒着输出
//		for (int i = arr.length-1; i >=0; i--) {
//			System.out.println(arr[i]);
//		}
		//排序,从小到大
		Arrays.sort(arr);
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
	}
}
