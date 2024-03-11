package homework_0311;
import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String[] menu = {"두부조림","미역국","요플레","바나나","우유","아몬드"};
		LunchMenu[] lm = {new Dubu() , new Seaweed() , new Yoplait() , new Banana() , new Almond() , new Milk()};		
		
		while(true) {
			System.out.println("==================== 메뉴판 =============================");
			System.out.println("1.두부조림  2.미역국  3.요플레  4.바나나  5.우유  6.아몬드  0.종료");
			System.out.println("=======================================================");
			System.out.println("한 사람당 한 메뉴는 한 번만 선택할 수 있습니다. (** 1인분 정량 지킴이 **)");
			System.out.println("=======================================================");
			System.out.println("쌀밥과 불고기는 기본제공으로 이 두 메뉴의 가격인 2,500원이 합산됩니다.");
			System.out.println("=======================================================");
			System.out.print("식사메뉴를 선택하세요 : ");
			choice = sc.nextInt();
			if(choice == 0) break;
			System.out.println();
			
			System.out.println("선택하신 메뉴는 "+menu[choice-1]+"입니다.");
			if(choice == 1) lm[choice-1].Dubu();
			else if(choice == 2) lm[choice-1].Seaweed();
			else if(choice == 3) lm[choice-1].Yoplait();
			else if(choice == 4) lm[choice-1].Banana();
			else if(choice == 5) lm[choice-1].Milk();
			else if(choice == 6) lm[choice-1].Almond();
			else if(choice <= -1 || choice >= 7) System.out.println("다시 선택하세요.");
			else break;

			System.out.println();
			MenuService totprice = new MenuService();
			int total = 0;
			switch(choice) {
				case 1:
					total += LunchMenu.DUBU;
					break;
					
				case 2:
					total += LunchMenu.SEAWEED;
					break;
					
				case 3:
					total += LunchMenu.YOPLAIT;
					break;
					
				case 4:
					total += LunchMenu.BANANA;
					break;
					
				case 5: 
					total += LunchMenu.MILK;
					break;
					
				case 6: 
					total += LunchMenu.ALMOND;
					break;
					
				case 0: break;
					
				default: System.out.println("다시 입력해주세요");
			}
			System.out.println("선택하신 메뉴들 가격의 총 합은 "+(total+2500)+"원 입니다.");
		}
		sc.close();
		}
	}
