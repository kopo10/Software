package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // 돈을 표시 할 때 쓰는 format
		Calendar k_10cal = Calendar.getInstance(); // 날짜 시간을 출력하기 위한 클래스
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜 시간을 표시하기 위한 format설정
		int k_10iPrice = 33000; // 설정한 가격

		double k_10taxRate = 1.1; // 택스율 + 1
		double k_10Bftax = k_10iPrice / k_10taxRate; // 소비자 가격에 택스율 + 1을 나눠주면 과세금액이 나온다.
		int k_10Real_Bftax_price; // 17line의 과세금액은  소숫점이 포함되있기 때문에 소수점을 없앤 진짜 과세금액을 선언
		if (k_10Bftax != ((int) k_10Bftax)) { // Bftax가 소수점이 있는지 없는지 확인하는 if
			k_10Real_Bftax_price = (int) k_10Bftax + 1; //만약 소수점이 있다면 소수점을 제거하고 + 1을 해준다
		} else { // 만약 소수점이 없다면
			k_10Real_Bftax_price = (int) k_10Bftax; // 그대로 인트로 변경해준다.
		} // 닫기
		int k_10tax = k_10iPrice - k_10Real_Bftax_price; //소비자 가격에서 과세금액을 빼준 값이 텍스이다.
		System.out.printf("%s\n", "신용승인"); // 출력
		System.out.printf("%s%24.20s\n", "단말기 : 2N68665898", "전표번호 : 041218"); // 출력
		System.out.printf("%s%2s", "가맹점 : ", "한양김치찌개\n"); // 출력
		System.out.printf("%s\n", "주소 : 경기 성남시 분당구 황새울로351번길 10  ,"); // 출력
		System.out.printf("%s\n", "1층"); // 출력
		System.out.printf("%s\n", "대표자 : 유창신"); // 출력
		System.out.printf("%s%26.20s\n", "사업자 : 752-53-00558", "TEL : 7055695"); // 출력
		System.out.printf("-----------------------------------------------\n"); // 출력
		System.out.printf("%s%38s%2s\n", "금  액", k_10df.format(k_10Real_Bftax_price), "원"); // 출력
		System.out.printf("%s%38s%2s\n", "부가세", k_10df.format(k_10tax), "원"); // 출력
		System.out.printf("%s%38s%2s\n", "합  계", k_10df.format(k_10iPrice), "원"); // 출력
		System.out.printf("-----------------------------------------------\n"); // 출력
		System.out.printf("%s\n", "우리카드"); // 출력
		System.out.printf("%s%11s\n", "카드번호 : 5387-20**-****-4613(S)", "일시불"); // 출력
		System.out.printf("%s%s\n", "거래일시 : ", k_10sdf.format(k_10cal.getTime())); // 출력
		System.out.printf("%s\n", "승인번호 : 70404427"); // 출력
		System.out.printf("%s\n", "거래번호 : 357734873739"); // 출력
		System.out.printf("%s%20s\n", "매입 : 비씨카드사", "가맹 : 720068568"); // 출력
		System.out.printf("%s\n", "알림 : EDC매출표"); // 출력
		System.out.printf("%s\n", "문의 : TEL)1544-4700"); // 출력
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n"); // 출력
		System.out.printf("%27s\n", "* 감사합니다 *"); // 출력
		System.out.printf("%45s\n", "표준V2.o0_20200212"); // 출력
	} // 닫기
} // 닫기
