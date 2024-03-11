package homework_0308;
import java.util.Scanner;

public class BunsikRun {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int coi = 0;
	 SeoulBunsik se = new SeoulBunsik();
	 WangjaBunsik wa = new WangjaBunsik();
	 WoojuBunsik woo = new WoojuBunsik();
	 BunsikService ser = new BunsikService();
	 
		while(true) {
			System.out.println("=====================================================");
			System.out.println("\t 1.서울분식  2.우주분식  3.왕자분식  4.종료");
			System.out.print("\t\t 조회할 가게를 선택해주세요 : ");
			System.out.println("\n=====================================================");
			coi = sc.nextInt();
		
			if(coi == 1) {
				ser.seoul();
			}
			else if(coi == 2) {
				ser.Wooju();
			}
			else if(coi == 3) {
				ser.wangja();
			}
			else if(coi == 4) break;
			else System.out.println("없는 항목입니다. 다시 선택해주세요."); 
		}
		System.out.println("가게조회를 종료합니다.");
		
	sc.close();
	}
}
