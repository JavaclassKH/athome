package homework_0229;

public class P3 {
	public static void main(String[] args) {
		
		int i = 0 , b3 = 0;	
		
		while(i<100) {	
			if(i % 3 == 0) {
				b3 += i;
			}
		i++;
		}
		System.out.println("3의 배수의 총합은 "+b3+"입니다.");	
	}
}
