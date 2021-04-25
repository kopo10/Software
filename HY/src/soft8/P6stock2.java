package soft8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P6stock2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));

		File f1 = new File("C:\\Users\\HY\\Desktop\\day_data\\Stock.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));

		String readtxt;

		
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = readtxt.split("%_%");

			if (field.length > 2 && field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				s.append(field[0].replace("^", "").trim());
				for (int j = 1; j < field.length; j++) {
					s.append("," + field[j].replace("^", "").trim());
				}
				bw1.write(s.toString());
				bw1.newLine();

			}
		}
		br.close();
		bw1.close();
	}
}
