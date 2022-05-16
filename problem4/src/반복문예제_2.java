
public class 반복문예제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음의 문장을 프로그램으로 작성.
//
//		두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하세요.
//
//		for문을 사용하며, 정수형 변수를 사용하세요.
//
//		if문 조건식을 사용하세요.
		
		int dic1 = 1;
		int dic2 = 1;
		
		for (dic1=1;dic1<=6;dic1++) {
			
			for (dic2=1;dic2<=6;dic2++) {
				
				if ((dic1 + dic2) == 6) {
					System.out.println(dic1 + "," + dic2);
					
				}
			}
		}
		
		
		
	}

}
