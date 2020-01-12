package Day7;

public class Demo3 {
	public static void main(String[] args) {

		char sex='妖';
		switch (sex) {
		case '男':
			System.out.println("今晚跟蒲老师走~~共度良宵~");
			break;
		case '女':
			System.out.println("今晚也跟蒲老师走~~共度良宵~");
			break;
		case '妖':
			System.out.println("必须跟我走~~");
			break;
		default:
			System.out.println("蒲老师走,我走");
			break;
		}
		
	}
}
