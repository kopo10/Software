package soft5;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10iWeekday = 5; // 일요일이 0 토요일이 6인데 출력할 년도의 1월 1일이 금요일이기 때문에 5로 정의햇다.
		int[] k_10iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 달의 마지막날을 배열로 나열햇다.
		for (int k_10iMon = 0; k_10iMon < 12; k_10iMon++) { //12월 까지 있으니까 0부터 11까지 출력
			if (k_10iMon == 0) { // 1월달은 처음 시작이기 때문에 11line 출력할 때 \n\n을 사용하지 않았다.
				System.out.printf("            %d월\n", k_10iMon + 1); // 출력
				System.out.printf("===========================\n");  // 출력
				System.out.printf(" 일  월  화  수  목  금  토\n"); // 출력
			} else { // 1월을 제외하고 전부
				System.out.printf("\n\n            %d월\n", k_10iMon + 1); // 각 월 사이에 공간을 만들어주고 싶어서  \n\n을 추가햇다.
				System.out.printf("===========================\n"); // 출력 
				System.out.printf(" 일  월  화  수  목  금  토\n"); // 출력
			} // 닫기
			for (int k_10i = 0; k_10i < k_10iWeekday % 7; k_10i++) { // 처음 시작의 기준을 만들어줘야하기 때문에 요일에 맞게 " "을 띄워준다.
				System.out.printf("    "); // 출력
			} // 닫기
			for (int k_10i = 1; k_10i <= k_10iEnd[k_10iMon]; k_10i++) { // 그 달의 날짜를 출력해주는 for, 8line의 배열을 가져와서 각 달의 마지막 날까지 반복한다.
				if (k_10iWeekday % 7 == 0 && k_10i != 1) { // weekday를 %로 나눈게 0이고 1일이 아니라면 라인을 내려준다. i != 1라는 조건이 없으면 어떤 월의 첫쨋날이 일요일이면 
					System.out.printf("\n");   // 출력                     그냥 띄워쓰기가 된다.
				} //닫기
				System.out.printf("%3d ", k_10i); // 날짜 출력
				k_10iWeekday++; // 줄마추기 위한 코드
			} //닫기
		} //닫기
	} //닫기
} //닫기
