import java.util.Scanner;

public class SummaGR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество  суммируемых  членов ряда");
		double n = in.nextInt();
		double sum=0; 
		double a=1; 
		for (int i = 1; i <= n; i++){ sum = sum + a/i; }
		System.out.println("Сумма равна" +" " +sum);
		in.close();
	}
	

}
