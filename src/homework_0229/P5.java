package homework_0229;

public class P5 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y <=10; y++) {
				if((2*x + 3*y) == 30) {
					System.out.println("(x="+x+", y="+y+")");
					cnt++;
				}
			}
		}
		System.out.println("조건을 만족하는 개수는? "+cnt+" 입니다.");
	}
}
