
public class 별_출력하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5 ; i++) {	
			if (i == 1) {
				for (int a = 6; a > 1 ; a--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int q = 5; q > i; q--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < i ; j++) {
				System.out.print("**");
			}
			System.out.println("");
			
		}
		
		for (int i = 3; i > 0 ; i--) {
			for (int q = 5; q > i; q--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < i ; j++) {
				System.out.print("**");
			}
			System.out.println("");
			if (i == 1) {
				for (int a = 6; a > 1 ; a--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}

}
