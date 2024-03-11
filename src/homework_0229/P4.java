package homework_0229;

public class P4 {
	public static void main(String[] args) {
		int su1 = 0, su2 = 0;
		
		while(true) {	
			su1 = (int)(Math.random()*6 + 1);
			su2 = (int)(Math.random()*6 + 1);
			System.out.println("("+su1+", "+su2+")");
			
				if((su1 + su2) == 5) break;
		}
		System.out.println("주사위 두 눈의 합이 5가 되어 실행을 종료합니다.");
	}
}
