import java.util.Scanner;

public class Stature {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your height");
		int a = in.nextInt();
		System.out.println("enter your weight");
		int b = in.nextInt();
		if ((a - 100) < b) {
			System.out.println("you need to lose weight");
		} else {
			System.out.println("you need to put on weight");
		}
		in.close();
	}

}
