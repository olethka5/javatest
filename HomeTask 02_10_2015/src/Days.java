import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите номер дня недели");
		int a = in.nextInt();
		if (a == 0 || a > 7) {
			System.out.println("Неделя - это всего 7 дней");
		}
		if (a == 1) {
			System.out.println("Понедельник");
		}
		if (a == 2) {
			System.out.println("Вторник");
		}
		if (a == 3) {
			System.out.println("Среда");
		}
		if (a == 4) {
			System.out.println("Четверг");
		}
		if (a == 5) {
			System.out.println("Пятница");
		}
		if (a == 6) {
			System.out.println("Суббота");
		}
		if (a == 7) {
			System.out.println("Воскресенье");
		}
		in.close();
	}

}
