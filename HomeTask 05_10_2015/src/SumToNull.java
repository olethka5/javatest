//7. В массиве из 10 чисел вычислить сумму элементов массива до первого нуля.
public class SumToNull {

	public static void main(String[] args) {

		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) Math.floor(Math.random() * 10);

			System.out.printf("%4d", mass[i]);
		}

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (mass[i] != 0) {
				sum = sum + mass[i];
			}
			else break;
		}

		
			if (mass[0] == 0) {
				System.out.print("Первый элемент массива равен нулю");

			} else {

				System.out.println();
				System.out.print("Сумма элементов массива до первого нуля=" + " " + sum);

			}

		}
	}

