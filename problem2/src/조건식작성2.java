
public class 조건식작성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		다음 문장을 프로그램으로 작성

		1부터 100까지의 정수 중에서 2 또는 3의 배수가 아닌 총 합을 구하여 출력하세요.

		if 조건문을 사용하세요.

		정수형 변수를 사용하세요.

		for (int i = 1; i < 100; i++) {
		          // 조건식 작성
		    }
		    // 결과값 출력
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
