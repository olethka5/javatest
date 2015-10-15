
/*2*. Написать программу,  которая вычисляет сумму первых n членов ряда: 1 +
1/2 + 1/3 + 1/4 +.... Количество  суммируемых  членов ряда  задается во время 
работы программы.*/
import java.util.Scanner;

public class SummaGR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество суммируемых членов ряда");
		double n = in.nextInt();
		double sum = 0;
		double a = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum + a / i;
		}
		System.out.println("Сумма равна" + " " + sum);
		in.close();
	}

}
