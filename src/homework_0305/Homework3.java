package homework_0305;
import java.util.Scanner;

//숙제3: 한글과 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램
//{{“love”, “사랑”} , {“java”, “자바”}}
public class Homework3 {
	public static void main(String[] args) {
	// 선언부(kor배열,eng배열,입력(Scanner),입력받은 영어단어 저장(what))
	Scanner sc = new Scanner(System.in);

	String[] kor = {"사랑","자바","자동차","집","돈"};
	String[] eng = {"love","java","car","home","money"}; 
	String what; 
	
	// 입력부
	System.out.print("영어단어를 입력하세요 : ");
	what = sc.next();
	System.out.println();
	
	// 처리부,출력부
	for(int i=0; i<=4; i++) {
		for(int j=0; j<=4; j++) {
			if(what.equals(eng[j])) 
			System.out.println(what+ "의 의미는 "+kor[j]+"입니다.");			
		}
	}
	
	
	
	}
}
