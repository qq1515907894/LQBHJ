package Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		//集合和数组 相互转换
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		//通常我们传入的数组不需要给定长度
		String[] strArr = list.toArray(new String[] {});
		//打印数组Arrays.toString(strArr),不用循环可以直接打印
		System.out.println(Arrays.toString(strArr));
		//打印二维数组
		int[][] arr={{1,2,3},{2,5,6},{8,9,2}};
		System.out.println(Arrays.deepToString(arr));
		
		//数组转List Arrays.asList()
		String[] strArr1 = { "a", "b", "c" }; 
		
		List<String> list1 = Arrays.asList(strArr);
		System.out.println(list1); // [a, b, c]
		
		
		
		
		
	}
	
	
}
