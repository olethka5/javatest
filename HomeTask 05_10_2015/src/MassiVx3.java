
import java.util.Scanner;

public class MassiVx3 {
	public static void main(String[] args) {
		int mas1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i = 0; i < mas1.length; i++) {
			System.out.printf("%4d",mas1[i]);
		}
		System.out.println();
		int mas2[] = new int[15];
		int j = 0;
		Scanner sc = new Scanner(System.in);
		for (j = 0; j < 15; j++) {

			System.out.println("¬ведите число:");
			mas2[j] = sc.nextInt();
		}
		sc.close();
		for (j = 0; j < 15; j++) {
			System.out.print(mas2[j] + " ");
		}
		System.out.println();
		int[] mass3  = new int[15];
		for(int i = 0; i <  15; i++) {mass3[i] = (int) Math.floor(Math.random() * 15);
		  		
		System.out.printf("%4d",mass3[i]);
		}
	}
	
}
