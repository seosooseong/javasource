package exception;

public class exceptionTest2 {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //런타임에러-실행해야 알 수 있음.
		
		System.out.println(value1+value2);
		
		
	}

}
