
public class �ݺ�������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ��� ���� 1
		
		/*for(int dan = 2 ; dan < 10 ; dan++) {
			for (int gob = 1; gob < 10; gob ++) {
				System.out.println(dan+"*"+gob+"="+dan*gob);
			}
		}*/
		int dan = 2;
		int gob = 1;
		
		while(dan < 10) {
			System.out.println("�� �� "+dan);
			while (gob < 10) {
				System.out.println(dan+"*"+gob+"="+dan*gob);
				gob += 1;
			}
			dan += 1;
			gob = 1;
			
		}
	}

}
