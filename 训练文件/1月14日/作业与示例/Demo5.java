package Day18;

import java.util.HashSet;

public class Demo5 {

	public static void main(String[] args) {
		
		//集合
		//优点:不重复
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(2);
		System.out.println(hs);
		//长度
		System.out.println(hs.size());
		
		
		
		
	}
}
