package exception;

/* Exception �� error(�ذ� ����, ��ǻ�� �ٿ�...)
*
* Exception(����)
* ������ ���� - �ڵ��� ��Ŭ������ �˷���. �ٷ� ĳġ����.
* ��Ÿ�� ���� - �����Ҷ� ��Ÿ���� ���ܻ���.
*	
*/
public class ExceptionTest {

	public static void main(String[] args) {
		//������ ����. ������ ��~
		try {
			Class.forName("java,lang,String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("�Է°��� Ȯ���� �ּ���");
		}
		
		
	}

}
