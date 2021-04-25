package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\HY\\Desktop\\전국무료와이파이표준데이터.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		if((readtxt = br.readLine()) == null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		String [] field_name = readtxt.split(",");
		int Linecnt = 0;
		while ((readtxt = br.readLine()) != null) {
			Linecnt++;	
			String [] field = readtxt.split(",");
			System.out.printf("**[%d번째 항목]********************\n", Linecnt);
			for (int i = 0; i<field_name.length; i++) {
				System.out.printf("%s : %s\n, ", field_name[i], field[i]);
			}
			System.out.printf("위도  : %s 경도 : %s\n", field[12], field[13]);
			System.out.printf("*************************************\n");
			
		}
		br.close();
		
		
	}

}
