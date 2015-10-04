import java.util.Scanner;

public class Summa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число от 1 до 100");
		int n = in.nextInt();

		int b;
		b = ((n * (n + 1)) / 2);
		System.out.println(b);

		in.close();
	}

}
