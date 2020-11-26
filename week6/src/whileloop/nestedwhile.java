package whileloop;

public class nestedwhile {

	public static void main(String[] args) {
	//nested for loop	
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("for :"+i+":"+j);
			}
		}
	//nested dowhile loop
		int i=0;
		do {
			int j=0;
			do {
				System.out.println("do while :"+i+":"+j);
				j++;
			}while(j<5);
			i++;	
		}while(i<5);
		
	//nested while loop
		int a=0;
		while(a<5) {
			int j=0;
			while(j<5) {
				System.out.println("while :"+a+":"+j);
				j++;
			}
			a++;
		}
		
		
		
		
		
		
}
}