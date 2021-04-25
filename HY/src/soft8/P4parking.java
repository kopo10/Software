package soft8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P4parking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double min = 1000000;
		double max = 0;
		File f = new File("C:\\Users\\HY\\Desktop\\csv�ѱ������������_������������������_20191224.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String readtxt;
		if ((readtxt = br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�.\n");
		}
		String[] field_name = readtxt.split(",");

		// ���ձ�� �츮�� �����浵, �������� �˾ƺ���
		double lat = 37.3860521; // ����
		double lng = 127.1214038; // �浵

		int LineCnt = 0;
		while ((readtxt = br.readLine()) != null) {

			LineCnt++;
			String[] field = readtxt.split(",");
			System.out.printf("==[%d��° �׸�]=========\n", LineCnt);
			if (field[2].contains(".") && field[3].contains(".")) {
				System.out.printf("%s : %s\n", field_name[6], field[6]); // 9�� �����ּ�
				System.out.printf("%s : %s\n", field_name[3], field[3]); // 12�� �����ּ�
				System.out.printf("%s : %s\n", field_name[2], field[2]); // 13�� �浵�ּ�

				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[3]) - lat, 2)
						+ Math.pow(Double.parseDouble(field[2]) - lng, 2));
				System.out.printf("���������� �Ÿ� : %f\n", dist); // �Ÿ����
				System.out.printf("==========================\n");

				if (min > dist) {
					min = dist;
				}
				if (max < dist) {
					max = dist;
				}

			}
		}
		br.close();
		System.out.printf("�ּҰ� : %f �ִ밪 : %f", min, max);

		// TODO Auto-generated method stub

	}

}
