import java.util.Scanner;

public class Year {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("enter year");
  int a = in.nextInt();
  if (a<1581)
  {
        System.out.println("Year must be greater than 1581");
  }else{
	  if ((a % 4 == 0)&&(a % 100 != 0) || (a % 400 == 0))
           {
                 System.out.println("leap year");
             }else{
              System.out.println("common year"); }
         
        in.close();
          }      
        }
 }