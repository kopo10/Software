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
			File f = new File("C:\\Users\\HY\\Desktop\\���������������ǥ�ص�����.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String readtxt;
			if ((readtxt = br.readLine()) == null) {
				System.out.printf("�� �����Դϴ�.\n");
			}
			String[] field_name = readtxt.split("\t");

			// ���ձ�� �츮�� �����浵, �������� �˾ƺ���
			double lat = 37.3860521;
			double lng = 127.1214038;

			int LineCnt = 0;
			while ((readtxt = br.readLine()) != null) {

				String[] field = readtxt.split("\t");
				System.out.printf("==[%d��° �׸�]=========\n", LineCnt);
				if (field[12].contains(".") && field[13].contains(".")) {
				System.out.printf("%s : %s\n", field_name[9], field[9]); // 9�� �����ּ�
				System.out.printf("%s : %s\n", field_name[12], field[12]); // 12�� �����ּ�
				System.out.printf("%s : %s\n", field_name[13], field[13]); // 13�� �浵�ּ�

				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[12]) - lat, 2)
						+ Math.pow(Double.parseDouble(field[13]) - lng, 2));
				System.out.printf("���������� �Ÿ� : %f\n", dist); // �Ÿ����
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
		System.out.printf("�ּҰ� : %f �ִ밪 : %f", min, max);
	}

}
