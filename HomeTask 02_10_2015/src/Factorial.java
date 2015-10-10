import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int a = 0;
		long b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите натуральное число");
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("¬ведите положительное число");
		} else {

			for (int i = a; i > 0; i--) {
				b *= i;
			}
			System.out.println("‘акториал числа" + " " + a + " " + "равен" + " " + b);

			sc.close();

		}
	}
}