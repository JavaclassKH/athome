package jongsang;

// 난수를 사용하여 두 난수의 합이 5가 될때 
// 경우의 수 두 가지를 출력하시오 (주사위처럼 1에서 6까지만 나오게)
// ex) (1,4) (2,3) (3,2) (4,1)
public class Exercise4 {
	public static void main(String[] args) {
		
		int dice1 = 0, dice2 = 0;
		
		while(true) {	
			dice1 = (int)(Math.random()*6 + 1);
			dice2 = (int)(Math.random()*6 + 1);
			System.out.println("("+dice1+", "+dice2+")");
			
			if((dice1 + dice2) == 5) break;
		}
		System.out.println("주사위 두 눈의 합이 5가 되어 실행을 종료합니다.");
	}
}
