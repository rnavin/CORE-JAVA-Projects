
public class RightTriangle {

	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		if (input <0) {
			System.out.println("input value must be >= 0");
			
		}
		else {
			for (int i= 1; i <= input;i++) {
				for (int j=input; j>i; j--) {
					System.out.print(" ");
				}
				for (int k =1; k<=i; k++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
