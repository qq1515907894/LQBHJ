package Day18;

import java.util.HashMap;

public class Demo6 {

	public static void main(String[] args) {
		//HashMap 哈希表
		//键值对:key value,通过key得到value值
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//[key,value]
		//[1:"Longjun"]
		//新增 put 
		hm.put(1, "Longjun");
		hm.put(2, "xx");
		//若key值重复插入,则值保存最后一个
		hm.put(2, "xxx");
		System.out.println(hm);
		
		//取值get 通过key来取
		System.out.println(hm.get(2));
		
		//HashMap<String,String> hm1=new HashMap<String,String>();
		//[key,value]
		//["2":"Longjun'Wifi"]
	
	}
}
