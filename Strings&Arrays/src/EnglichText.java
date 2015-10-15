import java.util.Scanner;

/*2.  В  английском  тексте  каждую  букву  заменить  ее  порядковым  номером  в
алфавите.  При  выводе  в  одной  строке  печатать  текст  с  двумя  пробелами 
между  буквами,  в  следующей  строке  внизу  под  каждой  буквой  печатать  ее 
номер.*/
public class EnglichText {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите текст:");
		String a = in.nextLine();
		String s = a.replaceAll(" ", "").toLowerCase();
		char[] chr = s.toCharArray();
		System.out.println(s);
		for (char ch : chr)
			if (Character.isLetter(ch))
				s += ch; // что то здесь не так
		System.out.println(s);
		String codeS = "";
		String formatS = "";
		for (char ch : s.toCharArray()) {
			codeS += Character.isAlphabetic(ch) ? String.format("%-3s", ch - 'a' + 1) : ch;
			formatS += Character.isAlphabetic(ch) ? String.format("%-3s", ch) : ch;
		}
		System.out.println(formatS);
		System.out.println(codeS);
		in.close();
	}
}