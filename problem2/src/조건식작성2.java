
public class ���ǽ��ۼ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		���� ������ ���α׷����� �ۼ�

		1���� 100������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� �� ���� ���Ͽ� ����ϼ���.

		if ���ǹ��� ����ϼ���.

		������ ������ ����ϼ���.

		for (int i = 1; i < 100; i++) {
		          // ���ǽ� �ۼ�
		    }
		    // ����� ���
		     */
		int a = 0;
		int a_total = 0;
		
		
		
		for (a = 1; a <= 100; a++) {
			if ((a%2)==0 || (a%3)==0) {
			}
			else {
				System.out.println(a);
				a_total += a; 
			}
		}
		System.out.println(a_total);
		

	}

}
