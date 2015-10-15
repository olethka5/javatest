/*4. В массиве из 15 чисел найти наибольший элемент и его индекс в массиве

5. В массиве из 15 чисел найти наименьший элемент и его индекс в массиве.*/
public class IndexMinMax {

	public static void main(String[] args) {
		int[] mass = new int[15];
		for (int i = 0; i < 15; i++) {
			mass[i] = (int) Math.floor(Math.random() * 15);

			System.out.print(mass[i] + "  ");
		}
		System.out.println();
		int min = mass[0];
		int max = mass[0];
		int imax = 0;
		int imin = 0;
		for (int i = 0; i < 15; i++) {

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
