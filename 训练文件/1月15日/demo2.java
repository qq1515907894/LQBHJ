package day_0115;
public class demo2 {

		public static void main(String[] args) {

				for (int i = 1000; i < 10000; i++) { 
					
					if (i%10==i/1000 && i%100/10==i%1000/100) {
						System.out.println(i);
					}

				}
				
			}
		}
