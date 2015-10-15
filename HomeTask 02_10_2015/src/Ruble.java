
/*6.  Написать  программу,  которая  после  введенного  с  клавиатуры  числа  (в 
диапазоне от 1 до 999), обозначающего денежную единицу, дописывает слово 
"рубль" в правильной форме. Например, 12 рублей, 21 рубль и т. д.*/
import java.util.Scanner;

public class Ruble {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число от 1 до 999");
		int a = in.nextInt();
		int n, b = 0;
		if (a > 100) {
			n = a % 100;
			b = n % 10;
		} else {
			if (a > 10 && a < 100) {
				b = a % 10;
			}
		}
		if (a >= 11 && a <= 14) {
			System.out.println(a + "рублей");

		} else {
			if ((a >= 2 && a <= 4) || (b >= 2 && b <= 4)) {
				System.out.println(a + " " + "рубля");
			} else {

				if ((a == 1) || (b == 1)) {
					System.out.println(a + " " + "рубль");
				} else {
					System.out.println(a + " " + "рублей");
				}

				in.close();
			}
		}
	}
}
