package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\HY\\Desktop\\���������������ǥ�ص�����.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		if((readtxt = br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�.\n");
			return;
		}
		String [] field_name = readtxt.split(",");
		int Linecnt = 0;
		while ((readtxt = br.readLine()) != null) {
			Linecnt++;	
			String [] field = readtxt.split(",");
			System.out.printf("**[%d��° �׸�]********************\n", Linecnt);
			for (int i = 0; i<field_name.length; i++) {
				System.out.printf("%s : %s\n, ", field_name[i], field[i]);
			}
			System.out.printf("����  : %s �浵 : %s\n", field[12], field[13]);
			System.out.printf("*************************************\n");
			
		}
		br.close();
		
		
	}

}
