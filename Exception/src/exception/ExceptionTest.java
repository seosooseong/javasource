package exception;

/* Exception 과 error(해결 못함, 컴퓨터 다운...)
*
* Exception(예외)
* 컴파일 예외 - 코딩시 이클립스에 알려줌. 바로 캐치가능.
* 런타임 예외 - 실행할때 나타나는 예외사항.
*	
*/
public class ExceptionTest {

	public static void main(String[] args) {
		//컴파일 예외. 빨간줄 쫙~
		try {
			Class.forName("java,lang,String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("입력값을 확인해 주세요");
		}
		
		
	}

}
