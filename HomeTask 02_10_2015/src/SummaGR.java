import java.util.Scanner;

public class SummaGR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����������  �����������  ������ ����");
		double n = in.nextInt();
		double sum=0; 
		double a=1; 
		for (int i = 1; i <= n; i++){ sum = sum + a/i; }
		System.out.println("����� �����" +" " +sum);
		in.close();
	}
	

}
