package problem6;

public class 반복문예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
	      int total = 1;
	      
	      
	      while (total < 100) {
	         while (num+total > 100) {
	         System.out.println("마지막으로 더한 값 : "+num +"   total : "+ total);
	         break;
	         }
	         num = num+1;
	         total = total + num;
	      }

	}

}
