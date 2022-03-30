package swap;
import java.util.*;
public class swap {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int a = x;
		x=y;
		y=a;
		System.out.println(" x = " + x + ","+ " y = " + y);
	}

}
