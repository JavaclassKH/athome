package jongsang;

public class naji {
	public static void main(String[] args) {
		for(int m=1; m<=5; m++) {
			for(int o=1; o<=m-1; o++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	