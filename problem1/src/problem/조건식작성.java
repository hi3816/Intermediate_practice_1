package problem;

public class 조건식작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건식 작성1
		
				int x = 15;
				
				if (10<x && x<20) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
				
		//조건식 작성1-2
				char ch = 'd';
				
				if (ch == 'x' || ch == 'X') {
					System.out.println("true");
				}
				else {
				System.out.println("not 'x'");
				}
				
		//조건식 작성1-3
		//char형 변수 ch가 숫자 (‘0’ ~ ‘9’)일 때 참(true)을 반환하는 조건식을 작성하라.
				
				ch = '9';
				
				if (48 <= (int)ch && (int)ch<= 57) {
					System.out.println("ture");
				}
				else {
					System.out.println("not 0~9");
				}
				
				
				
	}

}
