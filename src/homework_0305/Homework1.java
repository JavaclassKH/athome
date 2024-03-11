package homework_0305;

//1~45 숫자 중 6개의 수를 추출 후 정렬해서 출력하시오. (중복 배제)
public class Homework1 {
	public static void main(String[] args) {
		
	// 선언부 (배열용 변수(su),정렬용 자리바꿈 변수(temp))
			int[] su = new int[6];   // su = [0]1 [1]2 [2]3 [3]4 [4]5 [5]6
			int temp = 0;
			
			// 입력부 
			for(int i=0; i<=su.length; i++) {
				su[i] = (int)(Math.random() * 45) + 1;	
				for(int j=0; j<=su.length; j++)
				if(su[i] == su[i]) i--;  
			}
			// 정렬부 (오름차순 정렬)
			// su[0]일때 su[1]를 비교하여 su[2]가 작을 때 앞으로 옮겨줌
			for(int i=0; i<=4; i++) {
				for(int j=i+1; j<=i-1; j++) {
					if(su[i] < su[j]) temp = su[i];  su[i] = su[j];  su[j] = temp;
				}
			}
			
			// 출력부
			for(int i=0; i<=5; i++) {
				System.out.print(su[i] + " / ");
			}

	}
}
