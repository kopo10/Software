package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			double min = 1000000;
			double max = 0;
			File f = new File("C:\\Users\\HY\\Desktop\\전국무료와이파이표준데이터.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String readtxt;
			if ((readtxt = br.readLine()) == null) {
				System.out.printf("빈 파일입니다.\n");
			}
			String[] field_name = readtxt.split("\t");

			// 융합기술 우리집 위도경도, 지도에서 알아보기
			double lat = 37.3860521;
			double lng = 127.1214038;

			int LineCnt = 0;
			while ((readtxt = br.readLine()) != null) {

				String[] field = readtxt.split("\t");
				System.out.printf("==[%d번째 항목]=========\n", LineCnt);
				if (field[12].contains(".") && field[13].contains(".")) {
				System.out.printf("%s : %s\n", field_name[9], field[9]); // 9번 지번주소
				System.out.printf("%s : %s\n", field_name[12], field[12]); // 12번 위도주소
				System.out.printf("%s : %s\n", field_name[13], field[13]); // 13번 경도주소

				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[12]) - lat, 2)
						+ Math.pow(Double.parseDouble(field[13]) - lng, 2));
				System.out.printf("현재지점과 거리 : %f\n", dist); // 거리계산
				System.out.printf("==========================\n");
				
				if ( min > dist) {
					min = dist;
				}
				if(max < dist) {
					max = dist;
				}
				
				}
				LineCnt++;
			}
			br.close();
		System.out.printf("최소값 : %f 최대값 : %f", min, max);
	}

}
