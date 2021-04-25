package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P72015Samsung {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\stock_data\\StockSamsung.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String readtxt;
		int min = Integer.MAX_VALUE;
		int max = 0;
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = readtxt.split(",");

			if (field[1].contains("2015")) {
				if (min > Integer.parseInt(field[3])) {
					min = Integer.parseInt(field[3]);
				}
				if (max < Integer.parseInt(field[3])) {
					max = Integer.parseInt(field[3]);
				}

			}

		}
		System.out.printf("2015년 종가 기준 삼성전자 최저주가(종가기준) : %d\n"
				+ "2015년 종가 기준 삼성전자 최고주가(종가기준) : %d", min, max);
		
	}
}
