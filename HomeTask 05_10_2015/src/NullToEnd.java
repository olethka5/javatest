
public class NullToEnd {


		public static void main(String[] args) {

			int[] mass = new int[10];
			for (int i = 0; i < 10; i++) {
				mass[i] = (int) Math.floor(Math.random() * 10);

				System.out.printf("%4d", mass[i]);
			}

		
			  for (int i = 0; i<10; i++) {
				  if (mass[i]==0) continue;
				    {
				        int c=i;
				        while (mass[c]==0) c++;
				       
				        mass[i]=mass[c];
				        mass[c]=0;
				    }
		            System.out.printf("%4d", mass[i]);
		            }
		    }
		
				
	

			
			

				
				}


	
