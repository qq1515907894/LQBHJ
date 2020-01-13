package Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(21);
		list.add(10);
		list.add(12);
		list.add(910);
		list.add(91);
		list.add(1110);
		list.add(141);
		System.out.println(list);
		//集合的增删,替换set,查找get
		//排序
//		int[] arr={1,8,2,6,4};
//		Arrays.sort(arr);
//		//地址:[I@1fb8ee3
//		//System.out.println(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		 Collections.sort(list);
		 System.out.println(list);
		
		
		
	}
	
	
}
