package soft5;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k_10i = 1; k_10i < 4; k_10i++) { //147,258,369 단 총 3번을 출력하기 때문에 3번 i를 1.2.3 3번 출력한다.
			System.out.printf("★★★★★★★★★★★  ★★★★★★★★★★★  ★★★★★★★★★★★\n"); // 출력 
			System.out.printf("%5s%5d%5s%10s%5d%5s%11s%5d%5s\n", "구구단", k_10i, "단", "구구단", k_10i + 3, "단", "구구단", k_10i + 6, "단"); // 출력
			// System.out.printf(" 구구단 %d 단\t 구구단 %d 단 \t 구구단 %d 단\n", i, i + 3, i + 6); // 변경 전 코드 
			System.out.printf("★★★★★★★★★★★  ★★★★★★★★★★★  ★★★★★★★★★★★\n"); // 출력
			for (int k_10j = 1; k_10j < 10; k_10j++) { // 구구단이라서 1부터 9까지 출력
				if (k_10j == 9) { // 9단을 출력 할 때 \n\n 을 이용해서 한칸 빈공간을 만들어준다.
					System.out.printf("%3d%3s%3d%3s%3d%12d%3s%3d%3s%3d%12d%3s%3d%3s%3d\n\n", k_10i, "★", k_10j, "=", (k_10i * k_10j),  // 출력
							(k_10i + 3), "★", k_10j, "=", ((k_10i + 3) * k_10j), (k_10i + 6), "★", k_10j, "=", ((k_10i + 6) * k_10j)); // 출력
				} else { // j가 9가 아니라면
					System.out.printf("%3d%3s%3d%3s%3d%12d%3s%3d%3s%3d%12d%3s%3d%3s%3d\n", k_10i, "★", k_10j, "=", (k_10i * k_10j), //출력
							(k_10i + 3), "★", k_10j, "=", ((k_10i + 3) * k_10j), (k_10i + 6), "★", k_10j, "=", ((k_10i + 6) * k_10j)); //출력
				} // 닫기
			} //닫기
		} // 닫기
	} // 닫기 
} // 닫기
