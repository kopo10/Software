package soft8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7OnedayStock {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\stock_data\\Stock.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		File f1 = new File("C:\\Users\\HY\\Desktop\\stock_data\\StockOneday.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
			
		String readtxt;
		
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();			
			String[] field = readtxt.split(",");
			//KR7005930003
			if(field[1].contains("20120113")) {
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
