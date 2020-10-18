import java.util.*;

public class SecondLargest {
	
	public static void main(String[] args) {
		System.out.println("This program finds the two largest integers in a \n"
				+ "list. Enter values, one per line, using a 0 to \n"
				+ "signal the end of the list.");
		Scanner scan = new Scanner(System.in);
		int line = 0;
		int firstLargest = 0;
		int secondLargest = 0;
		while(true) {
			System.out.print("? ");
			line = scan.nextInt();
			if(line == 0) break;
			if(line > firstLargest) {
				firstLargest = line;
			} else if(line > secondLargest) {
				secondLargest = line;
			}
		}
		scan.close();
		System.out.println("The largest value is " + firstLargest);
		System.out.println("The second largest is " + secondLargest);
	}
}