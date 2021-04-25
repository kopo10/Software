package soft8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\HY\\Desktop\\writer.txt");
			FileWriter fw = new FileWriter(f);

			fw.write("¾È³ç11dd");
			
			fw.write("abcdddd");

			fw.close();

			FileReader fr = new FileReader(f);

			int n = -1;
			char[] ch;

			while (true) {
				ch = new char[10];
				n = fr.read(ch);
				System.out.println(n);
				System.out.println(ch);
				if (n == -1) {
					break;
				}
				for (int i = 0; i < n; i++) {
					// for(char c : ch)
					System.out.printf("%c", ch[i]);
				}

			}

			fr.close();

			System.out.printf("\n FILE READ END");

		} catch (Exception e) {
			System.out.printf("³ª ¿¡·¯ [%s]\n", e);
		}

	}

}
