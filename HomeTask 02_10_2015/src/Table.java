/*4*.  Написать  программу,  которая  выводит  таблицу  квадратов  первых  десяти
целых положительных чисел от 0 до 10. (но на самом деле это таблица умножения)*/
public class Table {

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int result = x * y;
				System.out.printf("%4d", result);

			}
			System.out.println();
		}
	}
}