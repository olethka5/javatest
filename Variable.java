import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int length = str.length();
		System.out.println("the length of this line is" + " " + length);
		in.close();
		final int mid = str.length() / 2;
		String parts1 = str.substring(0, mid);
		String parts2 = str.substring(mid);

		System.out.println(parts1);
		System.out.println(parts2);

	}
}