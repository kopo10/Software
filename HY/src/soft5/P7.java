package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // ���� ǥ�� �� �� ���� format
		Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð��� ����ϱ� ���� Ŭ����
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ �ð��� ǥ���ϱ� ���� format����
		int k_10iPrice = 33000; // ������ ����

		double k_10taxRate = 1.1; // �ý��� + 1
		double k_10Bftax = k_10iPrice / k_10taxRate; // �Һ��� ���ݿ� �ý��� + 1�� �����ָ� �����ݾ��� ���´�.
		int k_10Real_Bftax_price; // 17line�� �����ݾ���  �Ҽ����� ���Ե��ֱ� ������ �Ҽ����� ���� ��¥ �����ݾ��� ����
		if (k_10Bftax != ((int) k_10Bftax)) { // Bftax�� �Ҽ����� �ִ��� ������ Ȯ���ϴ� if
			k_10Real_Bftax_price = (int) k_10Bftax + 1; //���� �Ҽ����� �ִٸ� �Ҽ����� �����ϰ� + 1�� ���ش�
		} else { // ���� �Ҽ����� ���ٸ�
			k_10Real_Bftax_price = (int) k_10Bftax; // �״�� ��Ʈ�� �������ش�.
		} // �ݱ�
		int k_10tax = k_10iPrice - k_10Real_Bftax_price; //�Һ��� ���ݿ��� �����ݾ��� ���� ���� �ؽ��̴�.
		System.out.printf("%s\n", "�ſ����"); // ���
		System.out.printf("%s%24.20s\n", "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218"); // ���
		System.out.printf("%s%2s", "������ : ", "�Ѿ��ġ�\n"); // ���
		System.out.printf("%s\n", "�ּ� : ��� ������ �д籸 Ȳ�����351���� 10  ,"); // ���
		System.out.printf("%s\n", "1��"); // ���
		System.out.printf("%s\n", "��ǥ�� : ��â��"); // ���
		System.out.printf("%s%26.20s\n", "����� : 752-53-00558", "TEL : 7055695"); // ���
		System.out.printf("-----------------------------------------------\n"); // ���
		System.out.printf("%s%38s%2s\n", "��  ��", k_10df.format(k_10Real_Bftax_price), "��"); // ���
		System.out.printf("%s%38s%2s\n", "�ΰ���", k_10df.format(k_10tax), "��"); // ���
		System.out.printf("%s%38s%2s\n", "��  ��", k_10df.format(k_10iPrice), "��"); // ���
		System.out.printf("-----------------------------------------------\n"); // ���
		System.out.printf("%s\n", "�츮ī��"); // ���
		System.out.printf("%s%11s\n", "ī���ȣ : 5387-20**-****-4613(S)", "�Ͻú�"); // ���
		System.out.printf("%s%s\n", "�ŷ��Ͻ� : ", k_10sdf.format(k_10cal.getTime())); // ���
		System.out.printf("%s\n", "���ι�ȣ : 70404427"); // ���
		System.out.printf("%s\n", "�ŷ���ȣ : 357734873739"); // ���
		System.out.printf("%s%20s\n", "���� : ��ī���", "���� : 720068568"); // ���
		System.out.printf("%s\n", "�˸� : EDC����ǥ"); // ���
		System.out.printf("%s\n", "���� : TEL)1544-4700"); // ���
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - -\n"); // ���
		System.out.printf("%27s\n", "* �����մϴ� *"); // ���
		System.out.printf("%45s\n", "ǥ��V2.o0_20200212"); // ���
	} // �ݱ�
} // �ݱ�
