package problem5;

public class �ݺ�������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
	    int num2 = 0;
	    int total = 0;
	      
	    while (total < 100) {
	            num += 1;
	            if(num%2 == 0) {
	               num2 = num*(-1);
	               System.out.println("¦�� :"+ num2);
	               total = total + num2;
	            }
	            else {
	               System.out.println("Ȧ�� :"+num);
	               total = total + num;
	            }
	            System.out.println(" �� ��:"+ total);
	         }
	         System.out.println(" �� :"+ total);
	         
	}


	}


