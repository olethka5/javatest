
public class Multiplication {

	public static void main(String[] args) {

		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) Math.floor(Math.random() * 10);

			System.out.printf("%4d", mass[i]);
		}

		int res = 0;
		for (int i = 0; i < 10; i++) {
			if (mass[i] != 0) {
				res *= mass[i];
			}
			else break;
		}

		
			if (mass[0] == 0) {
				System.out.println();
				System.out.print("������ ������� ����� ����");

			} else {

				System.out.println();
				System.out.print("������������ ��������� � ������� �� ������� ����=" + " " + res);

			}

		}
	}
