import java.util.Scanner;
/* 
 * A program which calculates the difference between two dates
 * @author Nick Kammerer
 * @version 1.0
 */
public class DifferenceOfDates {
	/*
	 * Algebraically calculates the difference between two dates
	 * @param args A reference to a string array to store
     *             command-line arguments
	 */
	public static void main(String args[]) {
		// Input variables
		String firstMonth, firstYear, secondMonth, secondYear; 
		int differenceYears, differenceMonths; 
		Scanner input = new Scanner(System.in);
		// Calculation variables		
	    int intFirstMonth, intSecondMonth, intFirstYear, intSecondYear;
	    
		// Prompt & accept user input 
		System.out.println("For the first date,");
		System.out.print("Enter month: ");
		firstMonth = input.nextLine();
		System.out.print("Enter year: ");
		firstYear = input.nextLine();
		System.out.println(" ");
		System.out.println("For the second date,");
		System.out.print("Enter month: ");
		secondMonth = input.nextLine();
		System.out.print("Enter year: ");
		secondYear = input.nextLine();
		
		// Convert string first month to corresponding integer
		if (firstMonth.equalsIgnoreCase("January")) {
			intFirstMonth = 1;
		} else if (firstMonth.equalsIgnoreCase("February")) {
			intFirstMonth = 2;
		} else if (firstMonth.equalsIgnoreCase("March")) {
			intFirstMonth = 3;
		} else if (firstMonth.equalsIgnoreCase("April")) {
			intFirstMonth = 4;
		} else if (firstMonth.equalsIgnoreCase("May")) {
			intFirstMonth = 5;
		} else if (firstMonth.equalsIgnoreCase("June")) {
			intFirstMonth = 6;
		} else if (firstMonth.equalsIgnoreCase("July")) {
			intFirstMonth = 7;
		} else if (firstMonth.equalsIgnoreCase("August")) {
			intFirstMonth = 8;
		} else if (firstMonth.equalsIgnoreCase("September")) {
			intFirstMonth = 9;
		} else if (firstMonth.equalsIgnoreCase("October")) {
			intFirstMonth = 10;
		} else if (firstMonth.equalsIgnoreCase("November")) {
			intFirstMonth = 11;
		} else {
			intFirstMonth = 12;
		}
		
		// Convert string second month to corresponding integer
		if (secondMonth.equalsIgnoreCase("January")) {
			intSecondMonth = 1;
		} else if (secondMonth.equalsIgnoreCase("February")) {
			intSecondMonth = 2;
		} else if (secondMonth.equalsIgnoreCase("March")) {
			intSecondMonth = 3;
		} else if (secondMonth.equalsIgnoreCase("April")) {
			intSecondMonth = 4;
		} else if (secondMonth.equalsIgnoreCase("May")) {
			intSecondMonth = 5;
		} else if (secondMonth.equalsIgnoreCase("June")) {
			intSecondMonth = 6;
		} else if (secondMonth.equalsIgnoreCase("July")) {
			intSecondMonth = 7;
		} else if (secondMonth.equalsIgnoreCase("August")) {
			intSecondMonth = 8;
		} else if (secondMonth.equalsIgnoreCase("September")) {
			intSecondMonth = 9;
		} else if (secondMonth.equalsIgnoreCase("October")) {
			intSecondMonth = 10;
		} else if (secondMonth.equalsIgnoreCase("November")) {
			intSecondMonth = 11;
		} else {
			intSecondMonth = 12;
		}
		
		// Convert year strings into integers
		intFirstYear = Integer.parseInt(firstYear); 
		intSecondYear = Integer.parseInt(secondYear);
		
		// Calculate difference of months & years
		if (intFirstYear > intSecondYear) {
			differenceYears = intFirstYear - intSecondYear;
			if (intFirstMonth > intSecondMonth) {
				differenceMonths = intFirstMonth - intSecondMonth;
			} else if (intFirstMonth < intSecondMonth) {
				differenceMonths = intSecondMonth - intFirstMonth;
				differenceMonths = 12 + differenceMonths;
				differenceYears = differenceYears - 1; 
			} else {
				differenceMonths = 0; 
			}
		} else if (intFirstYear < intSecondYear) {
			differenceYears = intSecondYear - intFirstYear;
			if (intFirstMonth > intSecondMonth) {
				differenceMonths = intSecondMonth - intFirstMonth;
				differenceMonths = 12 + differenceMonths;
				differenceYears = differenceYears - 1; 
			} else if (intFirstMonth < intSecondMonth) {
				differenceMonths =  intSecondMonth - intFirstMonth; 
				} else {
				differenceMonths = 0;
			}
		} else {
			differenceYears = 0; 
			if (intFirstMonth > intSecondMonth) {
				differenceMonths = intFirstMonth - intSecondMonth;
			} else if (intFirstMonth < intSecondMonth) {
				differenceMonths = intSecondMonth - intFirstMonth;
			} else {
				differenceMonths = 0;
			}
		}
		
		// Close scanner
		input.close(); 
		
		// Final output
		System.out.println("");
		System.out.println("These dates are " + differenceYears + " years and " + differenceMonths + " months apart.");
	}
}
