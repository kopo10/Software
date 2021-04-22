package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �� ������ ��Ÿ���� ���� Ŭ����
		Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð� ���
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ �ð��� ��Ÿ���� ���� Ŭ����
		SimpleDateFormat k_10sdf1 = new SimpleDateFormat("YYYYMMdd"); // line13�� �ٸ� ���·� ����ϱ� ���� Ŭ����
		SimpleDateFormat k_10sdf2 = new SimpleDateFormat("YYYY/MM/dd HH:mm");
		String[] stringprice = new String[30];
		String[] stringtotalprice = new String[30];
		String[] stringunits = new String[30];
		
		String[] k_10itemname = { "123���ھ�����������()", "abc���ξ��ø���īĨ", "ddd���ڼ�����ġ��ġ", "a�ǽù��ܹ���", "ġ���������", "���󿡸�����",
				"�������������", "������Ŀ��()a", "��Ƽ���ƾ�", "��ټ��̸���", "�����ι�°����", "(���̹�����Ʈ����", "����Ŭ����������", "55��īĨ��Ͼ��", "�����¶�����",
				"ȣ���̵θ���ġŲ", "����ġŲ�ſ��", "��������øŰ�", "�����������", "�����ġ�佺", "��Ȧ��������Ʈ", "�ڹ�Ĩ��Ʈ�¸�����", "��������������", "�ڹٿ��̵�",
				"���̾�Ʈ�ڹ�", "�̰Ž���������", "���������ڼ�Ʈ", "������ﰢ���", "�Ŷ��¥���", "��������ġ" }; // item�̸��� ���� �迭�̴� �̸�,����,���� �迭�� ���߿� ��
																				// ���Ұ��̱� ������ �� �迭�� ũ��� ���ƾ��Ѵ�.
		int[] k_10price = { 12022220, 2200, 1300, 1400, 111500, 160, 1700, 1880, 1900, 2000, 2100, 2200, 2300, 2400,
				2500, 2600, // ������ ��ǰ�� ���� �Է�
				2700, 2800, 2900, 3000, 3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000 }; // ������ ��ǰ ���� �Է�
		int[] k_10units = { 3, 3, 3, 4, 12, 133, 12, 1, 1, 1, 1, 31, 1, 1, 2, 11, 1, 1, 15, 1, 51, 1, 5, 1, 1, 2, 1, 4, 1, 1 }; // ������
																														// ��ǰ
																														// ������
																														// �Է�
		boolean[] k_10taxfree = { true, false, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, false, true, true, true, true, true, false, true, true, false, true, true, true, true }; // ������ǰ��
																														// �������ǰ��
																														// �����ϱ�
																														// ����
																														// boolean
		int k_10With_tax_price = 0; // ������ǰ
		int k_10tax_free_price = 0; // �������ǰ
		int[] k_10total_price_sneak = new int[k_10itemname.length]; // �� ���ڱݾ��� �迭 ����� ����
		String[] k_10mark_check_free = { "*" }; // �������ǰ�� ���� ǥ�ø� ���� �迭
		String[] k_10make_space = { " " }; // ����� ��ǰ�� ĭ�� ���߱� ���� �迭

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� 0���� 29���� ����
			k_10total_price_sneak[k_10i] += k_10price[k_10i] * k_10units[k_10i]; // ��ǰ ���ݰ� ��ǰ ������ �����ش�.
			if (k_10taxfree[k_10i] == true) { // �ش� ��ǰ�� �������
				k_10With_tax_price += k_10total_price_sneak[k_10i]; // k_10With_tax_price �� �ش� ���ڿ� ���� �� ������ ��� �����ش�.
				k_10itemname[k_10i] = k_10make_space[0] + k_10itemname[k_10i]; // ������� " " ������ ������ش�
			} else { // �鼼ǰ���̶��
				k_10tax_free_price += k_10total_price_sneak[k_10i]; // �Ǽ�ǰ���� ��ǰ���� ���� �����ش�.
				k_10itemname[k_10i] = k_10mark_check_free[0] + k_10itemname[k_10i]; // �鼼ǰ���ΰ� ǥ�� �� " * "�� �����ش�.
			} // �ݱ�
		} // �ݱ�

		double k_10taxrate = 0.1; // �������� 10%�� �����Ѵ�.
		// double k_10before_tax_price = k_10With_tax_price / (1 + k_10taxrate); // �Һ���
		// ���ݿ����� 1 + ������ �����شٸ� �����ݾ��� ���� �� �ִ�
		int k_10real_before_tax_price = (int) (k_10With_tax_price / (1 + k_10taxrate)); // �����ݾ��� �Ҽ��� �����ϰ� ��� ���߿� ��������
																						// ������ �Ҽ��� �ݾ� ����
		int k_10total_real_surtax = k_10With_tax_price - k_10real_before_tax_price; // �Һ��� ���ݿ��� �����ݾ��� ���� �ݾ��� �ΰ����̴�

		System.out.printf("%s%27s\n", "emart", "�̸�Ʈ ������ (031)888-1234"); // ( ) ���
		System.out.printf("%32s\n", "206-86-50913 ����"); // ( ) ���
		System.out.printf("%31s\n", "���� ������ ������� 552"); // ( ) ���
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�"); // ( ) ���
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)"); // ( ) ���
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)"); // ( ) ���
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)"); // ( ) ���
		System.out.println(""); // ( ) ���
		System.out.printf("%s%s%18s\n", "[�� ��]", k_10sdf2.format(k_10cal.getTime()), "POS:0011-9861"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%17s%6s%6s\n", "��ǰ��", "�� ��", "�� ��", "�� ��"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
//			char a = k_10itemname[k_10i].charAt(10);
//			System.out.println(a);
//			int LastWordByte = String.valueOf(a).getBytes().length;
			//System.out.println(LastWordByte);
			//System.out.println(a);
			//System.out.println(String.valueOf(a).getBytes().length);
			
			if (k_10itemname[k_10i].length() > 10) {
				k_10itemname[k_10i] = k_10itemname[k_10i].substring(0, 10);
			}
			int num = 20 - k_10itemname[k_10i].getBytes().length;
			for (int k_10j = 0; k_10j < num; k_10j++) {
				k_10itemname[k_10i] += " ";
			}
		}

		for (int k_10i = 0; k_10i < k_10price.length; k_10i++) {
			stringprice[k_10i] = String.valueOf(k_10price[k_10i]);

			int num = 10 - stringprice[k_10i].getBytes().length;
			for (int k_10j = 0; k_10j < num; k_10j++) {
				stringprice[k_10i] += " ";
			}
		}

		for (int k_10i = 0; k_10i < k_10units.length; k_10i++) {
			stringunits[k_10i] = String.valueOf(k_10units[k_10i]);
			int num = 3 - stringunits[k_10i].getBytes().length;
			for(int k_10j = 0;  k_10j < num;  k_10j++) {
				stringunits[k_10i] += " ";
			}
			
		}
		
		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) {
			stringtotalprice[k_10i] = String.valueOf(k_10total_price_sneak[k_10i]);
			int num = 8 - String.valueOf(k_10total_price_sneak[k_10i]).getBytes().length;

			for (int k_10j = 0; k_10j < num; k_10j++) {
				stringtotalprice[k_10i] = " " + stringtotalprice[k_10i];

			}
		}

		for (int k_10i = 0; k_10i < k_10itemname.length; k_10i++) { // i�� 0 ���� 29���� ��� (��ǰ�� 30�� �����ϱ�)
			if (k_10i % 5 == 0) { // 6��°���� ������� ----�� ��������ν� ���� 5������ �ٷ� �����ش�.
				System.out.printf("-----------------------------------------\n"); // ( ) ���
			}
			System.out.printf("%s%s%s%s\n", k_10itemname[k_10i], stringprice[k_10i], stringunits[k_10i],
					stringtotalprice[k_10i]); // ���� �ݾ� ���� �� ���� ���
		}
		int k_10total_pay = ((k_10tax_free_price + k_10real_before_tax_price + k_10total_real_surtax) / 10) * 10; // �츮�����
																													// ����
																													// 1����
																													// ������
																													// �����Ƿ�
																													// 1��������
																													// �������ش�.
		System.out.printf("%20s%16s\n", "�ѹ�ǰ����", k_10itemname.length); // ��ǰ�� ���� ���
		System.out.printf("%20s%16s\n", "�Ѹ鼼��ǰ", k_10tax_free_price); // �鼼�� �Ǵ� ��ǰ�� �Ѿ�
		System.out.printf("%20s%16s\n", "�Ѱ�����ǰ", k_10real_before_tax_price); // ������ǰ�� �Ѿ�
		System.out.printf("%22s%16s\n", "��  ��  ��", k_10total_real_surtax); // �ΰ����� �Ѿ�
		System.out.printf("%23s%16s\n", "��      ��", k_10total_pay); // �Ѿ�
		System.out.printf("%s%29s\n", "�������ݾ�", k_10total_pay); // �� �����ؾ� �ϴ� �ݾ�
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658"); // ( ) ���
		System.out.printf("%s%30s\n", "ī�����", "�Ͻú� / 164.980"); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]"); // ( ) ���
		System.out.printf("%s\n", "��*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ( ) ���
		System.out.printf("%s%18s%9s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164"); // ( ) ���
		System.out.printf("%s%16s%9s\n", "����(����)����Ʈ", k_10df.format(5637), k_10df.format(5473)); // ( ) ��� 0,000�������� ����
																									// ����ϱ� ����
																									// df.format�� ����ߴ�.
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�."); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%25s\n", "���űݾױ��� ���������ð� ����ο�"); // ( ) ���
		System.out.printf("%s%30s\n", "������ȣ :", "34��****"); // ( ) ���
		System.out.printf("%s%31s\n", "�����ð� :", k_10sdf.format(k_10cal.getTime())); // ( ) ���
		System.out.printf("-----------------------------------------\n"); // ( ) ���
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150"); // ( ) ���
		System.out.printf("%15s%s", k_10sdf1.format(k_10cal.getTime()), "/00119861/00164980/31"); // ( ) ���
	}
}
