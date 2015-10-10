import static java.lang.System.out;

public class Table {

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int result = x * y;
				out.printf("%4d", result);

			}
			out.println();
		}
	}
}