package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P5stock {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\stock_Data\\stock.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String readtxt;
		int LineCnt = 0;
		int n = -1;
		StringBuffer s = new StringBuffer();
		while (true) {
			
			char[] ch = new char[1000];

			n = br.read(ch);
			if (n == -1) {
				break;
			}

//			for(int i = 0; i < n; i++) {
//				System.out.printf("%c", ch[i]);
//			}			
			for (char c : ch) {		
				if (c == '\n') {
					System.out.printf("[%s]***\n", s.toString());
					s.delete(0, s.length());
				} else {
					s.append(c);
				}
			}
			LineCnt++;
		}
		System.out.printf("[%s]***\n", s.toString());
		br.close();
	}

}
