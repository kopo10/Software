package soft8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7stockSamSung {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\stock_data\\Stock.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		File f1 = new File("C:\\Users\\HY\\Desktop\\stock_data\\StockSamsung.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
			
		String readtxt;
		
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();			
			String[] field = readtxt.split(",");
			//KR7005930003
			if(readtxt.contains("A005930")) {
				for(int i = 0; i < field.length; i++) {
					s.append(field[i] + ",");	
				}
				bw1.write(s.toString());
				bw1.newLine();
				System.out.printf("[%s]***\n", s.toString());
			}
		}
		br.close();
		bw1.close();
	}

}


//		s.append("표준 종목 코드,주식 영업 일자, 유가증권 단축 종목코드,주식종가,주식 시가,주식최고가,주식 최저가,전일 대비 부호,"
//				+ "전일 대비,전일 대비율,전일 거래량,누적 거래량,누적 거래 대금,매도호가1,매수호가1,총 매도호가 잔량,총 매수호가 잔량,"
//				+ "매도 체결 합계,매수 체결 합계,매도 거래 대금(누적),매수 거래 대금(누적),매도 체결 건수,매수 체결 건수,52주일 최고가,"
//				+ "52주일 최저가,52주일 최고가 일자,52주일 최저가 일자,시간외 단일가 최종 시간,시간외 단일가 현재가,시간외 단일가 전일 대비,"
//				+ "시간외 단일가 전일 대비 부호,시간외 단일가 매도호가1, 시간외 단일가 매수호가1,시간외 단일가 거래량,시간외 단일가 거래 대금,"
//				+ "시간외 단일가 시가,시간외 단일가 최고가,시간외 단일가 최저가,장개시전 시간외종가 거래량,장개시전 시간외종가 거래 대금,"
//				+ "장종료후 시간외종가 거래량,장종료후 시간외종가 거래 대금,시장 분류 구분 코드,주당 배당 금액,상장 주수,주식 기준가,"
//				+ "주식 액면가,가중 평균 주식 가격,종목 한도 비율,외국인 한도 수량,주문 가능 수량,외국인 한도 소진 구분 코드,외국인 보유 수량,"
//				+ "외국인 보유 비율,HTS 외국인 소진율,장중 최종 NAV,전일 최종 NAV,추적 오차율,괴리율,공매도차입증권매도체결수량,공매도차입증권매도거래대금,"
//				+ "외국인 순매수,락구분 코드,분할 비율,누적 분할 비율,전체융자잔고비율,베타 계수(90일),DEL 상관 계수,DEL 강세 계수,DEL 약세 계수,"
//				+ "DEL 강세 편차,DEL 약세 편차,DEL 강세 상관계수,DEL 약세 상관계수,주식 상한가,주식 하한가,증자 구분 코드,장중 거래량,장중 거래대금,"
//				+ "액면가 변경 구분 코드,재평가 종목 사유 코드,기관계 순매수,수정주가 (교보:fnguide때문에 추가),주식 시가,주식 최고가,주식 최저가.주식 종가,"
//				+ "누적 거래량,누적 거래 대금,분할 비율,락구분 코드,0-정상.1-권리.2-배당.3-권배락,4-신규상장.5-액면분할.6-신주상장,8-비공모고신규상장.9-거래정지 : 락구분");
//		