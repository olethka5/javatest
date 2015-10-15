
/*1.  В  каждом  слове  текста  k­ю  букву  заменить  заданным  символом  c
клавиатуры. Если k больше длины слова, корректировку не выполнять.*/
import java.util.Scanner;

class Replacement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите текст:");
		String s = in.nextLine();
		System.out.println("Введите номер буквы, которую хотите заменить");
		int n = in.nextInt();
		int k = n - 1;
		System.out.println("Введите символ, на который хотите заменить");
		Scanner in1 = new Scanner(System.in);
		String s2 = in1.nextLine();
		char m = 'm';
		m = s2.charAt(0);
		String[] line = s.split(" ");

		for (int i = 0; i < line.length; i++) {
			char[] chars = line[i].toCharArray();

			if (line.length > k) {
				for (int j = 0; j < chars.length; j++) {
					if (j == k)
						chars[j] = m;

					System.out.print(chars[j]);
				}

			} else {

				System.out.print(line[i]);
			}
			System.out.print(" ");
		}
		in.close();
		in1.close();

	}
}
