/*3*.  Написать  программу,  которая  вычисляет  факториал  введенного  с 
клавиатуры числа.*/
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int a = 0;
		long b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("Факториал определён только для целых неотрицательных чисел");
		} else {

			for (int i = a; i > 0; i--) {
				b *= i;
			}
			System.out.println("Факториал числа" + " " + a + " " + "равен" + " " + b);

			sc.close();

		}
	}
}