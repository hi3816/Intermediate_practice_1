package problem;

public class ���ǽ��ۼ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǽ� �ۼ�1
		
				int x = 15;
				
				if (10<x && x<20) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
				
		//���ǽ� �ۼ�1-2
				char ch = 'd';
				
				if (ch == 'x' || ch == 'X') {
					System.out.println("true");
				}
				else {
				System.out.println("not 'x'");
				}
				
		//���ǽ� �ۼ�1-3
		//char�� ���� ch�� ���� (��0�� ~ ��9��)�� �� ��(true)�� ��ȯ�ϴ� ���ǽ��� �ۼ��϶�.
				
				ch = '9';
				
				if (48 <= (int)ch && (int)ch<= 57) {
					System.out.println("ture");
				}
				else {
					System.out.println("not 0~9");
				}
				
				
				
	}

}
