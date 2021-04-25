package soft8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7stockSamSung {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HY\\Desktop\\stock_data\\Stock.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		File f1 = new File("C:\\Users\\HY\\Desktop\\stock_data\\StockSamsung.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
			
		String readtxt;
		
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();			
			String[] field = readtxt.split(",");
			//KR7005930003
			if(readtxt.contains("A005930")) {
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


//		s.append("ǥ�� ���� �ڵ�,�ֽ� ���� ����, �������� ���� �����ڵ�,�ֽ�����,�ֽ� �ð�,�ֽ��ְ�,�ֽ� ������,���� ��� ��ȣ,"
//				+ "���� ���,���� �����,���� �ŷ���,���� �ŷ���,���� �ŷ� ���,�ŵ�ȣ��1,�ż�ȣ��1,�� �ŵ�ȣ�� �ܷ�,�� �ż�ȣ�� �ܷ�,"
//				+ "�ŵ� ü�� �հ�,�ż� ü�� �հ�,�ŵ� �ŷ� ���(����),�ż� �ŷ� ���(����),�ŵ� ü�� �Ǽ�,�ż� ü�� �Ǽ�,52���� �ְ�,"
//				+ "52���� ������,52���� �ְ� ����,52���� ������ ����,�ð��� ���ϰ� ���� �ð�,�ð��� ���ϰ� ���簡,�ð��� ���ϰ� ���� ���,"
//				+ "�ð��� ���ϰ� ���� ��� ��ȣ,�ð��� ���ϰ� �ŵ�ȣ��1, �ð��� ���ϰ� �ż�ȣ��1,�ð��� ���ϰ� �ŷ���,�ð��� ���ϰ� �ŷ� ���,"
//				+ "�ð��� ���ϰ� �ð�,�ð��� ���ϰ� �ְ�,�ð��� ���ϰ� ������,�尳���� �ð������� �ŷ���,�尳���� �ð������� �ŷ� ���,"
//				+ "�������� �ð������� �ŷ���,�������� �ð������� �ŷ� ���,���� �з� ���� �ڵ�,�ִ� ��� �ݾ�,���� �ּ�,�ֽ� ���ذ�,"
//				+ "�ֽ� �׸鰡,���� ��� �ֽ� ����,���� �ѵ� ����,�ܱ��� �ѵ� ����,�ֹ� ���� ����,�ܱ��� �ѵ� ���� ���� �ڵ�,�ܱ��� ���� ����,"
//				+ "�ܱ��� ���� ����,HTS �ܱ��� ������,���� ���� NAV,���� ���� NAV,���� ������,������,���ŵ��������Ǹŵ�ü�����,���ŵ��������Ǹŵ��ŷ����,"
//				+ "�ܱ��� ���ż�,������ �ڵ�,���� ����,���� ���� ����,��ü�����ܰ����,��Ÿ ���(90��),DEL ��� ���,DEL ���� ���,DEL �༼ ���,"
//				+ "DEL ���� ����,DEL �༼ ����,DEL ���� ������,DEL �༼ ������,�ֽ� ���Ѱ�,�ֽ� ���Ѱ�,���� ���� �ڵ�,���� �ŷ���,���� �ŷ����,"
//				+ "�׸鰡 ���� ���� �ڵ�,���� ���� ���� �ڵ�,����� ���ż�,�����ְ� (����:fnguide������ �߰�),�ֽ� �ð�,�ֽ� �ְ�,�ֽ� ������.�ֽ� ����,"
//				+ "���� �ŷ���,���� �ŷ� ���,���� ����,������ �ڵ�,0-����.1-�Ǹ�.2-���.3-�ǹ��,4-�űԻ���.5-�׸����.6-���ֻ���,8-������űԻ���.9-�ŷ����� : ������");
//		