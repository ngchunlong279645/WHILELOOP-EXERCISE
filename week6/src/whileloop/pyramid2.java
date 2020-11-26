package whileloop;

public class pyramid2 {

	public static void main(String[] args) {
// for inverted pyramid 		
		for(int i=0;i<=10;i++) {
			for(int j=10;j>i;j--) {
			System.out.print("*");
				
			}
			System.out.println("");
		} 

// do while inverted pyramid 
		int i=0;
		do {
			int j=10;
			do {
				System.out.print("*");
				j--;
			}while(j>i);
			System.out.println("");
			i++;
		}while(i<10);
		
// while inverted pyramid	
		int a = 0;
		while(a<10) {
			int j = 10;
			while(j>a) {
				System.out.print("*");
				j--;
			}
			System.out.println("");
			a++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
