package whileloop;

public class whileloop {

	public static void main(String[] args) {
// for loop
		
		for(int i=0; i<=10;i++) {
			System.out.println("for : "+i);
			System.out.println("i++ : "+i);
		}
		System.out.println(" ");
//while loop		
		int i=0;
		while(i<=10) {
			System.out.println("while :"+i);
			i++;
			System.out.println("i++ : "+i);
			}
		System.out.println("");
//do while loop		
		int j=0;
		do {
			System.out.println("do while :"+j);
			j++;
			System.out.println("j++ : "+j);
		}while(j<=10);
	

	}

}
