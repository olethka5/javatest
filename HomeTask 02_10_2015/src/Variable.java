
/*1. Создайте переменную типа String c любым текстом (не сильно короткое).
Далее  выведите  на  экран  количество  символов  в  данной  строке.  Далее 
разделите  строку  пополам  (если  ровно  поделить  не  выходит  то  +­1  не 
страшно), в результате у вас должно быть 2­е новых переменных типа String с 
частями из изначальной строки. Полученные строки выведите на экран.*/
import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите любую строку");
		String str = in.nextLine();
		int length = str.length();
		System.out.println("Длинна этой строки" + " " + length + " " + "символов");
		in.close();
		final int mid = str.length() / 2;
		String parts1 = str.substring(0, mid);
		String parts2 = str.substring(mid);

		System.out.println(parts1);
		System.out.println(parts2);

	}
}