package homework_0229;

public class P6 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			 for(int j=2; j<=i; j++) {	
				 System.out.print("*");
			}
			System.out.println();
		}
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print(" ");
			}
			for(int l=1; l<=5-k; l++) {
				System.out.print("*");
			}
			for(int l=1; l<=4-k; l++) {
				System.out.print("*");
			}
			 System.out.println();	
		}
	}
}
