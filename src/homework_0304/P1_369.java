package homework_0304;

//#1. 3,6,9 게임
//1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.
public class P1_369 {
	public static void main(String[] args) {
		int[] game = {3,6,9};

			for(int i=1; i<=100; i++) {
				System.out.print(i + " / ");	
				if(game.equals(i)) System.out.print("짝 / ");
				if(i % 10 == 0) System.out.println();
			}	
	}
}


