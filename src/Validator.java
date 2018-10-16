import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static String getString(Scanner sc, String prompt) { // Validate String
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc, String prompt) { // Validate Int
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) { // Validate Int within Range
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) { // Validate double
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) { // Validate double within Range
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) { // Validate String using
																								// RegEx
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}

	public static boolean isValidName(Scanner scan) {

		String userName;
		String nameCheck;
		// getString(scan, prompt);
		boolean test = true;

		// scan = new Scanner(System.in);
		System.out.println("Enter a name: ");

		if (scan.hasNextLine()) {
			userName = scan.nextLine();

			if (userName.length() > 30) {
				System.out.println("You entered too many characters!");
				return false;
			} else if (Character.toString(userName.charAt(0)).matches("[^A-Z]")) {
				System.out.println("The first letter needs to be capitalized!");
				return false;
			} else if (userName.substring(1).matches("[^a-z]\\w+")) {

				return test;
			}

		}

	}
}
