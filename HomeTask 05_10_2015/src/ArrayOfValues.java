
public class ArrayOfValues {

	public static void main(String[] args) {
		float[] val = { 5, 12, 6, 78, 59, 32, 47, 58, 21, 45 };
		int i = 0;
		int j = 0;
		for (i = 0, j = 1; i < 10 && j <= 10; i++, j++) {

			System.out.println("Значение" + j + "=" + val[i]);
		}

		float sum = 0;
		for (i = 0; i < 10; i++) {
			sum = (sum + val[i]);
		}
		System.out.println("average value" + "=" + sum/10 );

	}
}
