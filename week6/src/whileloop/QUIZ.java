package whileloop;

public class QUIZ {

	public static void main(String[] args) {
// 1.
		System.out.println("1.");
		int max = 5;
		for (int n = 1; n <= max; n++) {
		    System.out.println(n);
		}
		System.out.println();
//1. while	
		System.out.println("1.");
		int maX=5;
		int t =1;
		while(t<=maX) {
			System.out.println(t);
			t++;
		}
		System.out.println();
		
//2.	
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		    total = total - number;
		    System.out.println(total + " " + number);
		}
		System.out.println();
//2.while		
		System.out.println("2.");
		int numbeR= 1;
		int totaL = 25;
		while (numbeR<=(totaL/2)) {
			totaL = totaL - numbeR;
			System.out.println(totaL+ " " + numbeR );
			numbeR++;
		}
		
//3.	
		System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
		    for (int j = 1; j <= 3; j++) {
		        for (int k = 1; k <= 4; k++) {
		            System.out.print("*");
		        }
		        System.out.print("!");
		    }
		    System.out.println();
		}
		System.out.println();	
//3. while		
		System.out.println("3.");	
		int a=1;
		while(a<=2) {
			int b=1;
			while(b<=3) {
				int c=1;
				while(c<=4) {
					 System.out.print("*");
					 c++;
				}
				System.out.print("!");
				b++;
			}
			System.out.println();	
			a++;
		}
					
// 4.
		System.out.println("4.");
		int number = 4;
		for (int count = 1; count <= number; count++) {
		    System.out.println(number);
		    number = number / 2;
		} 
//4. while		
		System.out.println("4.");
		int counT =1;
		int numBER =4;
		while( counT <=numBER) {
			System.out.println(numBER);
		    numBER = numBER / 2;
		    counT++;
		}
		
		
		
		
		
		
		
	}

}
