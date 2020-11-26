package whileloop;

public class pyramid1 {

	public static void main(String[] args) {
// for pyramid	
		for(int i=0;i<=10;i++) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
				
			}
			System.out.println("");
		} 

// while pyramid
		int i=0;
		while(i<10) {
			int j=0;
			while(j<=i) {
			System.out.print("*");
			j++;
				}
			System.out.println("");
			i++;
			}
		
		
// do while pyramid
	int a=0;
	do {
		int j=0;
		do {
			System.out.print("*");
			j++;
		}while(j<=a);
		System.out.println("");
		a++;
	}while(a<10);
		
	
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
