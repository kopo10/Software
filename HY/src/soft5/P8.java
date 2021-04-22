package soft5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k_10df = new DecimalFormat("###,###,###,###,###"); // �������� ǥ���ϱ� ���� Ŭ����
		Calendar k_10cal = Calendar.getInstance(); // ��¥ �ð��� ǥ���ϱ� ���� Ŭ����
		SimpleDateFormat k_10sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ �ð��� ���¸� �����ϱ� ���� Ŭ����

		String k_10itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)"; //������ �̸� ����
		String k_10itemcode1 = "1031615"; // ������ �ڵ� ����
		int k_10price1 = 3000; // ������ 3000���� ����
		int k_10amount1 = 1; // ������ 1�� ����
		int k_10total_price1 = k_10price1 * k_10amount1; // 1�� ������ �� ������ ǥ�� 
		
		String k_10itemname2 = "�����̵�ĸ���(������)(100ȣ)"; // 2�� ������ ������ �̸� ����
		String k_10itemcode2 = "11008152"; // ������ �ڵ� ����
		int k_10price2 = 1000; // ������ 1000���� ����
		int k_10amount2 = 1; // ������ 1�� ����
		int k_10total_price2 = k_10price2 * k_10amount2; // 2�� ������ �� ������ ǥ��
		
		String k_10itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // 3�� ������ �̸� ����
		String k_10itemcode3 = "1020800"; // ������ �ڵ� ����
		int k_10price3 = 1000; // ������ ���� ����
		int k_10amount3 = 1; // ������ ���� ����
		int k_10total_price3 = k_10price3 * k_10amount3; // ������ 3��  �� ������ ����

		double k_10taxRate = 1.1; // ������ 0.1 + 1 �� ����;
		double k_10_tax1 = k_10price1 - (k_10price1 / k_10taxRate); // ���ݿ��� �����ݾ��� ���ָ� �ý��� ���� �� �ִ�.
		int k_10real_tax1; // �Ҽ����� �� ������ ���ϱ� ���� ���������.
		if (k_10_tax1 == (int) (k_10_tax1)) { //���� �Ҽ����� ���ٸ�
			k_10real_tax1 = (int) k_10_tax1; // �״�� int�� ��ȯ�� ���ش�.
		} else { // ���� �Ҽ����� �־ ���� �ʴٸ�
			k_10real_tax1 = (int) k_10_tax1 + 1; // ��Ʈ�� ��ȯ�ؼ� �Ҽ����� ���� �� + 1 �� ���ش�.
		} // �ݱ�
		int k_10bf_tax_price1 = k_10price1 - k_10real_tax1; // �����ݾ�
		int k_10total_af_price1 = k_10bf_tax_price1 * k_10amount1; // �����ݾ� * ���� // �Ѱ����ݾ�
	

		double k_10_tax2 = k_10price2 - (k_10price2 / k_10taxRate); // ���ݿ��� �����ݾ��� ���ָ� �ý��� ���� �� �ִ�.
		int k_10real_tax2; // �ý��� �����ֱ� ����  ���� 
		if (k_10_tax2 == (int) (k_10_tax2)) { // ���� �Ҽ����� ���ٸ�
			k_10real_tax2 = (int) k_10_tax2; // �״�� int�θ� ��ȯ
		} else { // �Ҽ����� �ִٸ�
			k_10real_tax2 = (int) k_10_tax2 + 1; // int�� ��ȯ ��  �Ҽ��� ���� �� + 1
		} // �ݱ�
		int k_10bf_tax_price2 = k_10price2 - k_10real_tax2; //�Һ��� ���ݿ��� �ý��� ������ �����ݾ�
		int k_10total_af_price2 = k_10bf_tax_price2 * k_10amount2; // �����ݾ� * ���� = �� �����ݾ�
		
		double k_10_tax3 = k_10price3 - (k_10price3 / k_10taxRate); // �Һ��ڰ��ݿ��� �����ݾ��� ���� �ݾ� = ����
		
		int k_10real_tax3 ; // �Ҽ����� ���� ���ݸ� ���ϱ� ���� ����
		if (k_10_tax3 == (int) (k_10_tax3)) { // ���ݿ� �Ҽ����� ���ٸ�
			k_10real_tax3 = (int) k_10_tax3; // int�� ��ȯ
		} else { // �װ� �ƴ϶��
			k_10real_tax3 = (int) k_10_tax3 + 1; // ��Ʈ�� ��ȯ �� + 1
		} // �ݱ�
		int k_10bf_tax_price3 = k_10price3 - k_10real_tax3; // �Һ��� ���ݿ��� ������ �� ���� �ݾ�
		int k_10total_af_price3 = k_10bf_tax_price3 * k_10amount3; // �����ݾ׿��� ������ ���� �� �����ݾ�

		System.out.printf("%20s\n", "\"���ΰ���, ���̼�\""); // ( ) ���
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����"); // ( ) ���
		System.out.printf("%s\n", "��ȭ: 031-702-6016"); // ( ) ���
		System.out.printf("%s\n", "����: ���� ������ ���μ�ȯ�� 2748 (���)"); // ( ) ���
		System.out.printf("%s\n", "��ǥ: ������,��ȣ�� 213-81-52063"); // ( ) ���
		System.out.printf("%s\n", "����: ��⵵ ������ �д籸 �д��53���� 11 (����"); // ( ) ���
		System.out.printf("%s\n", "��)"); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%29s\n", "�Һ��� �߽ɰ濵(CCM) ������� "); // ( ) ���
		System.out.printf("%30s\n", "ISO 9001 ǰ���濵�ý��� �������"); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%25s\n", "��ȯ/ȯ�� 14��(03��12��)�̳�,"); // ( ) ���
		System.out.printf("%s\n", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����"); // ( ) ���
		System.out.printf("%24s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�"); // ( ) ���
		System.out.printf("%23s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�"); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%s%35s\n", "[POS 1058231]", k_10sdf.format(k_10cal.getTime())); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%.10s%14s%6s%9s\n", k_10itemname1, k_10df.format(k_10price1), k_10df.format(k_10amount1), k_10df.format(k_10price1 * k_10amount1)); // ( ) ���
		System.out.printf("[%s]\n", k_10itemcode1); // ( ) ���
		System.out.printf("%.10s%14s%6s%9s\n", k_10itemname2, k_10df.format(k_10price2), k_10df.format(k_10amount2), k_10df.format(k_10price2 * k_10amount2)); // ( ) ���
		System.out.printf("[%s]\n", k_10itemcode2); // ( ) ���
		System.out.printf("%.10s%14s%6s%9s\n", k_10itemname3, k_10df.format(k_10price3), k_10df.format(k_10amount3), k_10df.format(k_10price3 * k_10amount3)); // ( ) ���
		System.out.printf("[%s]\n", k_10itemcode3); // ( ) ���
		System.out.printf("%15s%29s\n", "�����հ�", k_10df.format(k_10total_af_price1 + k_10total_af_price2  + k_10total_af_price3)); // ( ) ���
		System.out.printf("%15s%30s\n", "�ΰ���", k_10df.format(k_10real_tax1 + k_10real_tax2 + k_10real_tax3)); // ( ) ���
		System.out.printf("------------------------------------------------\n"); // ( ) ���
		System.out.printf("%s%40s\n", "�Ǹ��հ�", k_10df.format(k_10total_price1 + k_10total_price2 + k_10total_price3)); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%s%40s\n", "�ſ�ī��", k_10df.format(k_10total_price1 + k_10total_price2 + k_10total_price3)); // ( ) ���
		System.out.printf("------------------------------------------------\n"); // ( ) ���
		System.out.printf("%s%40s\n", "�츮ī��", "538720**********"); // ( ) ���
		System.out.printf("%s%18s%6s\n", "���ι�ȣ 77982843(0)", "���αݾ�", k_10df.format(k_10total_price1 + k_10total_price2 + k_10total_price3)); // ( ) ���
		System.out.println("================================================"); // ( ) ���
		System.out.printf("%30s%s\n", k_10sdf.format(k_10cal.getTime()), "�д缭����"); // ( ) ���
		System.out.printf("%s\n", "��ǰ �� ��Ÿ ���� : 1522-4400"); // ( ) ���
		System.out.printf("%s\n", "����� �� �����̼� ���� ���� : 1599-2211"); // ( ) ���
		System.out.printf("%33s\n", "2112820610158231"); // ( ) ���
		System.out.printf("%s\n", "�´��̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�"); // ( ) ���
		System.out.printf("%25s\n", "ȸ������ �� �پ��� ������ ����������! ��"); // ( ) ���
	}
}
