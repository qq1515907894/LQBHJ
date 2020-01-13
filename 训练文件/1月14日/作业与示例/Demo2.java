package Day18;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
		    list.add(i);
		}
		System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		//含前不含后(3,8),不包括下标为8的值
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList); // [3, 4, 5, 6, 7] 
	}
	
}
