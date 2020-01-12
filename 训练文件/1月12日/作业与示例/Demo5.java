package Day12;

public class Demo5 {

	public static void main(String[] args) {
		//4.有参有返回值
		
		Demo5 demo5=new Demo5();
		
		System.out.println(demo5.f(10, 40));
		
		System.out.println(demo5.f1(10, 40));
		
	}
	//王乐说大二有10人,
	//程昊说大一有40人
	//蒲老师要返回给大家有50人
	public int f(int num1,int num2){
	
		int num3=num1+num2;
		return num3;
	}
	
	public String f1(int num1,int num2){
		
		int num3=num1+num2;
		//字符串加数字等于字符串
		return "我们蓝桥要不培训共有"+num3+"人";
	}
	
	
	
	
}
