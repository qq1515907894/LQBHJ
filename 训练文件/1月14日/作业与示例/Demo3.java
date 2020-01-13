package Day18;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

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
		//遍历可以用for循环
		//foreach循环和增强for循环 主要用于集合和数组的遍历
		int[] arr={21, 10, 12, 910, 91, 1110, 141};
		for (int integer : arr) {
			System.out.println(integer);
		}
		
		
		
		
		
		
	}
	
}
