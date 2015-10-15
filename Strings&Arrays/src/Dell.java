
/*3.  Из  небольшого  текста  удалить  все  символы,  кроме  пробелов,  не 
являющиеся буквами.*/
import java.util.Scanner;

public class Dell {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите текст:");
		String a = in.nextLine();
		a = a.replaceAll("[^A-Za-zА-Яа-я]", " ");
		System.out.println(a);
		in.close();
	}
}