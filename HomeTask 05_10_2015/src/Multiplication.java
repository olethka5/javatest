//8. В массиве из 10 чисел вычислить произведение элементов массива до первого нуля.
public class Multiplication {

	public static void main(String[] args) {

		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) Math.floor(Math.random() * 10);

			System.out.printf("%4d", mass[i]);
		}

		int res = 1;
		for (int i = 0; i < 10; i++) {
			if (mass[i] != 0) {
				res=res* mass[i];
			}
			else break;
		}

		
			if (mass[0] == 0) {
				System.out.println();
				System.out.print("Первый элемент массива равен нулю");

			} else {

				System.out.println();
				System.out.print("Произведение элементов массива до первого нуля(или до конца масива, если нуля нет)=" + " " + res);

			}

		}
	}
