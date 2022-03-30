// Name : Rahul Navin;
// Student Id :- 261062889;
import java.util.*;

public class CoinMachine {
// class name : CoinMachine
	public static void main(String[] args) {
		int cash = Integer.parseInt(args[0]);
		int prize = Integer.parseInt(args[1]);
         // enter arg always be multiples of 5 
		//cash amount always be >= to prize of the item;
		int change = (cash - prize);
		// pennies are not considered;
	
		System.out.println("Amount received:" + cash);
		System.out.println("Cost of the item:" + prize);
	    System.out.println("Required Change:" + change);
	    System.out.println(); // to add extra line space;
	    System.out.println("Change: ");
	    System.out.println("    toonies x " + (change/200));
	    System.out.println("    loonie x " + ((change%200)/100));
	    System.out.println("    quater x " + ((change%200)%100)/25);
	    System.out.println("    dime x " + (((change%200)%100)%25)/10);
	    System.out.println("    nickel x " + ((((change%200)%10)%25)%10)%5);
	} 
}
	
	
