/*2. Создайте массив с 10­ю переменными типа int. Используя оператор "for" найдите и
выведите на экран наименьшее и наибольшее значение в массиве.
min value =  "значение которое у вас получилось".
max value =  "значение которое у вас получилось".
При выводе данных постарайтесь использовать форматирование описанное в статье
про форматирование строк.*/

public class MinMax {

	public static void main(String[] args) {
		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) Math.floor(Math.random() * 10);

			System.out.println(mass[i] + "  ");
		}
		int min = mass[0];
		int max = mass[0];
		int imax = 0;
		int imin = 0;
		for (int i = 0; i < 10; i++) {

			if (mass[i] > max) {
				max = mass[i];
				imax = i;
			}
			if (mass[i] < min) {
				min = mass[i];
				imin = i;
			}
		}
		System.out.println("min value = " + min);
		System.out.println("max value = " + max);
		System.out.println("index min = " + imin);
		System.out.println("index max = " + imax);

	}

}
