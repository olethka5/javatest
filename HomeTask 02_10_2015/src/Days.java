import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ��� ������");
		int a = in.nextInt();
		if (a == 0 || a > 7) {
			System.out.println("������ - ��� ����� 7 ����");
		}
		if (a == 1) {
			System.out.println("�����������");
		}
		if (a == 2) {
			System.out.println("�������");
		}
		if (a == 3) {
			System.out.println("�����");
		}
		if (a == 4) {
			System.out.println("�������");
		}
		if (a == 5) {
			System.out.println("�������");
		}
		if (a == 6) {
			System.out.println("�������");
		}
		if (a == 7) {
			System.out.println("�����������");
		}
		in.close();
	}

}
