import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number a");
		int a = in.nextInt();
		System.out.println("enter the number b");
		int b = in.nextInt();
		if (a == b) {
			System.out.println("Numbers are equal");
		} else if (a > b) {
			System.out.println("A more than B");
		} else {
			System.out.println("B more than A");
		}

		in.close();
	}

}