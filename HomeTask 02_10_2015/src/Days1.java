/* 7.  Напишите  программу,  которая  запрашивает  у  пользователя  номер  дня 
недели,  затем выводит название дня недели или сообщение об ошибке, если 
введены неверные данные.*/
import java.util.Scanner;

public class Days1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите номер дня недели");
		int a = in.nextInt();
		switch (a) {
		case 1:

			System.out.println("Понедельник");
			break;

		case 2:

			System.out.println("Вторник");
			break;

		case 3:

			System.out.println("Среда");
			break;
		case 4:

			System.out.println("Четверг");
			break;
		case 5:

			System.out.println("Пятница");
			break;
		case 6:

			System.out.println("Суббота");
			break;
		case 7:

			System.out.println("Воскресенье");
			break;

		default:

			System.out.println("Неделя - это всего 7 дней");
		}
		in.close();
	}
}
