package forloop;

public class forLoop {

	public static void main(String[] args) {
		int i ,j,k; 
		for(i=0; i<=10;i++) {
			System.out.println("for : "+i);
			System.out.println("i++ : "+i);
		}
		System.out.println(" ");
		for(i=8; i>0;i--) {
			System.out.println(i);
		}
		
		for(i=0; i<5;i++) {
			for(j=4;j>=0;j--) {
				System.out.println(i+":"+j);
			}
		}
		
		for(i=0;i<=50;i++) {
			for(j=0;j<i;j++) {
			System.out.print("*");
				
			}
			System.out.println("");
		}
		
		for(i=0;i<=50;i++) {
			for(j=50;j>i;j--) {
			System.out.print("*");
				
			}
			System.out.println("");
		}
		
		
		
	
		
		
		
		
	}

}
