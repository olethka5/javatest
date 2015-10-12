
public class Negative {
	public static void main(String[] args) {
		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) Math.floor(Math.random()*20-10);

			System.out.printf("%4d", mass[i]);
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (mass[i] < 0) {
				sum=sum+1;
			  }
		   }  
		   System.out.println();
		   System.out.print("Сумма отрицательных элементов в массиве-"+" " +sum);
		  }
		}