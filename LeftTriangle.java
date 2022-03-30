
public class LeftTriangle {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		if (input <0) {
			System.out.println("input value must be >= 0");
			
		}
		else {
			for (int i=0; i<= input-1 ; i++) {
				for (int j=0; j <= i ; j++) {
					System.out.print("*");
				}
				System.out.println();
				
				
			}
		}
		
	}

}
