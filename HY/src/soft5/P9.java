package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // 돈 단위를 나타내기 위한 클래스
		Calendar k_10cal = Calendar.getInstance(); // 날짜 시간 출력
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜 시간을 나타내기 위한 클래스
		SimpleDateFormat k_10sdf1 = new SimpleDateFormat("YYYYMMdd"); // line13과 다른 형태로 출력하기 위한 클래스
		SimpleDateFormat k_10sdf2 = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		String[] stringprice = new String[30];
		String[] stringtotalprice = new String[30];
		String[] stringunits = new String[30];
		
		String[] k_10itemname = { "123초코없는초코파이()", "abc파인애플맛포카칩", "ddd초코센드위치위치", "a피시방햄버거", "치즈없는피자", "도라에몽파이",
				"뉴질랜드산항이", "오늘의커피()a", "시티위아아", "삼다수이리터", "스물두번째과자", "(싸이버버세트라지", "프링클스오리지널", "55포카칩어니언맛", "떡없는떡볶이",
				"호식이두마리치킨", "땅땅치킨매운맛", "라면은역시매고랭", "된장찌개맛사탕", "삼겹살맛치토스", "나홀로집에세트", "자바칩세트는맛없다", "오레오레오레오", "자바에이드",
				"자이언트자바", "이거슨오떡오떡", "마지막과자세트", "차가운삼각김밥", "신라면짜장맛", "맛탕과김치" }; // item이름을 위한 배열이다 이름,가격,수량 배열을 나중에 다
																				// 더할것이기 때문에 셋 배열의 크기는 같아야한다.
		int[] k_10price = { 12022220, 2200, 1300, 1400, 111500, 160, 1700, 1880, 1900, 2000, 2100, 2200, 2300, 2400,
				2500, 2600, // 각각의 상품의 가격 입력
				2700, 2800, 2900, 3000, 3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // 각각의 상품 가격 입력
		int[] k_10units = { 3, 3, 3, 4, 12, 133, 12, 1, 1, 1, 1, 31, 1, 1, 2, 11, 1, 1, 15, 1, 51, 1, 5, 1, 1, 2, 1, 4, 1, 1 }; // 각각의
																														// 상품
																														// 수량을
																														// 입력
		boolean[] k_10taxfree = { true, false, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, false, true, true, true, true, true, false, true, true, false, true, true, true, true }; // 과세물품과
																														// 비과세물품을
																														// 구별하기
																														// 위한
																														// boolean
		int k_10With_tax_price = 0; // 과세물품
		int k_10tax_free_price = 0; // 비과세물품
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // 총 과자금액의 배열 사이즈를 정의
		String[] k_10mark_check_free = { "*" }; // 비과세물품을 위한 표시를 위한 배열
		String[] k_10make_space = { " " }; // 비과세 물품과 칸을 맞추기 위한 배열

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i가 0부터 29까지 돌때
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // 상품 가격과 상품 수량을 곱해준다.
			if (k_10taxfree[k_10i] == true) { // 해당 상품이 과세라면
				k_10With_tax_price += k_10total_price_sneak[k_10i]; // k_10With_tax_price 에 해당 과자에 대한 총 가격을 계속 더해준다.
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // 과세라면 " " 공간을 만들어준다
			} else { // 면세품목이라면
				k_10tax_free_price += k_10total_price_sneak[k_10i]; // 맨세품목인 제품들을 전부 더해준다.
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // 면세품목인걸 표시 할 " * "을 더해준다.
			} // 닫기
		} // 닫기

		double k_10taxrate = 0.1; // 세금율을 10%로 정의한다.
		// double k_10before_tax_price = k_10With_tax_price / (1 + k_10taxrate); // 소비자
		// 가격에에서 1 + 세율을 나눠준다면 과세금액을 구할 수 있다
		int k_10real_before_tax_price = (int) (k_10With_tax_price / (1 + k_10taxrate)); // 세전금액을 소숫점 제거하고 출력 나중에 세금으로
																						// 절삭한 소숫점 금액 보완
		int k_10total_real_surtax = k_10With_tax_price - k_10real_before_tax_price; // 소비자 가격에서 과세금액을 빼준 금액이 부가세이다

		System.out.printf("%s%27s\n", "emart", "이마트 죽전점 (031)888-1234"); // ( ) 출력
		System.out.printf("%32s\n", "206-86-50913 강희석"); // ( ) 출력
		System.out.printf("%31s\n", "용인 수지구 포은대로 552"); // ( ) 출력
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가"); // ( ) 출력
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신설 7일)"); // ( ) 출력
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)"); // ( ) 출력
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)"); // ( ) 출력
		System.out.println(""); // ( ) 출력
		System.out.printf("%s%s%18s\n", "[구 매]", k_10sdf2.format(k_10cal.getTime()), "POS:0011-9861"); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%17s%6s%6s\n", "상품명", "단 가", "수 량", "금 액"); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
//			char a = k_10itemname[k_10i].charAt(10);
//			System.out.println(a);
//			int LastWordByte = String.valueOf(a).getBytes().length;
			//System.out.println(LastWordByte);
			//System.out.println(a);
			//System.out.println(String.valueOf(a).getBytes().length);
			
			if (k_10itemname[k_10i].length() > 10) {
				k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 10);
			}
			int num = 20 - k_10itemname[k_10i].getBytes().length;
			for (int k_10j = 0; k_10j < num; k_10j++) {
				k_10itemname[k_10i] += " ";
			}
		}

		for (int k_10i = 0; k_10i < k_10price.length; k_10i++) {
			stringprice[k_10i] = String.valueOf(k_10price[k_10i]);

			int num = 10 - stringprice[k_10i].getBytes().length;
			for (int k_10j = 0; k_10j < num; k_10j++) {
				stringprice[k_10i] += " ";
			}
		}

		for (int k_10i = 0; k_10i < k_10units.length; k_10i++) {
			stringunits[k_10i] = String.valueOf(k_10units[k_10i]);
			int num = 3 - stringunits[k_10i].getBytes().length;
			for(int k_10j = 0;  k_10j < num;  k_10j++) {
				stringunits[k_10i] += " ";
			}
			
		}
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
			stringtotalprice[k_10i] = String.valueOf(k_10total_price_sneak[k_10i]);
			int num = 8 - String.valueOf(k_10total_price_sneak[k_10i]).getBytes().length;

			for (int k_10j = 0; k_10j < num; k_10j++) {
				stringtotalprice[k_10i] = " " + stringtotalprice[k_10i];

			}
		}

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i가 0 부터 29까지 출력 (제품이 30개 있으니까)
			if (k_10i % 5 == 0) { // 6번째마다 출력전에 ----을 출력함으로써 과자 5개마다 줄로 나눠준다.
				System.out.printf("-----------------------------------------\n"); // ( ) 출력
			}
			System.out.printf("%s%s%s%s\n", k_10itemname[k_10i], stringprice[k_10i], stringunits[k_10i],
					stringtotalprice[k_10i]); // 과자 금액 수량 총 가격 출력
		}
		int k_10total_pay = ((k_10tax_free_price + k_10real_before_tax_price + k_10total_real_surtax) / 10) * 10; // 우리나라는
																													// 현재
																													// 1원이
																													// 사용되지
																													// 않으므로
																													// 1원단위는
																													// 절삭해준다.
		System.out.printf("%20s%16s\n", "총물품수량", k_10itemname.length); // 물품의 수량 출력
		System.out.printf("%20s%16s\n", "총면세물품", k_10tax_free_price); // 면세가 되는 제품의 총액
		System.out.printf("%20s%16s\n", "총과세물품", k_10real_before_tax_price); // 과세물품의 총액
		System.out.printf("%22s%16s\n", "부  가  세", k_10total_real_surtax); // 부가세의 총액
		System.out.printf("%23s%16s\n", "합      계", k_10total_pay); // 총액
		System.out.printf("%s%29s\n", "결제대상금액", k_10total_pay); // 총 결제해야 하는 금액
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658"); // ( ) 출력
		System.out.printf("%s%30s\n", "카드결제", "일시불 / 164.980"); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%23s\n", "[신세계포인트 적립]"); // ( ) 출력
		System.out.printf("%s\n", "류*열 고객님의 포인트 현황입니다."); // ( ) 출력
		System.out.printf("%s%18s%9s\n", "금회발생포인트", "9350**9995", "164"); // ( ) 출력
		System.out.printf("%s%16s%9s\n", "누계(가용)포인트", k_10df.format(5637), k_10df.format(5473)); // ( ) 출력 0,000형식으로 돈을
																									// 출력하기 위해
																									// df.format을 사용했다.
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다."); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%25s\n", "구매금액기준 무료주차시간 차등부여"); // ( ) 출력
		System.out.printf("%s%30s\n", "차량번호 :", "34저****"); // ( ) 출력
		System.out.printf("%s%31s\n", "입차시간 :", k_10sdf.format(k_10cal.getTime())); // ( ) 출력
		System.out.printf("-----------------------------------------\n"); // ( ) 출력
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150"); // ( ) 출력
		System.out.printf("%15s%s", k_10sdf1.format(k_10cal.getTime()), "/00119861/00164980/31"); // ( ) 출력
	}
}
