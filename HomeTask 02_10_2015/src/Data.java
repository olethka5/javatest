
/*1*. Напишите программу, которая по дате определяет день недели, на который 
эта дата приходится. Для вычисления дня недели воспользуйтесь формулой:
где, d — число месяца, m — номер месяца, если начинать счет с марта, как это 
делали в Древнем Риме (март — 1, апрель — 2, ..., февраль — 12), Y — номер 
года  в  столетии,  с —  количество  столетий.  Квадратные  скобки  означают,  что 
надо взять целую часть от значения, находящегося в скобках. Вычисленное по 
формуле значение определяет день недели: 1 — понедельник, 2 — вторник, ...,
  6 — суббота, 0 — воскресенье*/

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {

		int y = 0;
		int m = 0;
		int d = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("enter day");
		d = in.nextInt();
		if (1 > d && d > 31) {
			System.out.println("Enter a number from 1 to 31");
		} else {
			System.out.println("enter month");
			m = in.nextInt();
			if (1 > m && m > 12) {
				System.out.println("Enter a number from 1 to 12");
			} else {
				System.out.println("enter yar");
				y = in.nextInt();
			}
		}

		String a[] = new String[7];
		a[0] = "Sunday";
		a[1] = "Monday";
		a[2] = "Tuesday";
		a[3] = "Wednesday";
		a[4] = "Thursday";
		a[5] = "Friday";
		a[6] = "Saturday";

		if (m < 3) {
			m = m + 10;
			y = y - 1;
		} else {
			m = m - 2;
		}
		int c = y / 100;
		int q = 0;
		q = (int) Math.floor((13 * m - 1) / 5);
		y = y % 100;
		int y1 = (int) Math.floor(y / 4);
		int c1 = (int) Math.floor(c / 4);
		int w = (int) Math.abs(d + q + y + y1 + c1 - 2 * c + 777) % 7;
		System.out.println("today is" + " " + a[w]);

		in.close();
	}
}
