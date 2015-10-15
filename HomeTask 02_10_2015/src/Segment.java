
//3. Написать программу, которая вычисляет частное двух чисел.
import java.util.Scanner;

public class Segment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number a");
		int a = in.nextInt();
		System.out.println("enter the number b");
		int b = in.nextInt();
		if (b == 0) {
			System.out.println("error");
		} else {
			float c = a / ((float) b);
			System.out.println("result is" + " " + c);
		}
		in.close();
	}

}