package calc;

import java.util.Scanner;

public class Calculator {

	// global variables
	private static final Scanner scanner = new Scanner(System.in);

	// Text System.out.println herausheben
	public static void print(String txt) {
		System.out.println(txt);
	}

	public static void printUI(String txt) {
		System.out.println("***************************************************************");
	}

	// Main Ausführung
	public static void main(String[] args) {

		boolean terminate = false;

		do {
			// Abfrage welches Kalkulations-Modell es sein soll
			printUI("");
			print("Would you like to make floating point calculations?");
			print("type 'y' for yes and anything else for integer calculations");
			String inputOp = scanner.nextLine();
			printUI("");

// WENN FLOAT GERECHNET WERDEN SOLL
			if (inputOp.equals("y")) {

				// Eingabe erste Zahl
				print("Type in the first number: ");
				String inputX = scanner.nextLine();
				float x = Float.parseFloat(inputX);
				print("x = " + x);
				printUI("");

				// Eingabe zweite Zahl
				print("Type in the second number: ");
				String inputY = scanner.nextLine();
				float y = Float.parseFloat(inputY);
				print("y = " + y);
				printUI("");

				// Abfrage welche Kalkulation vorgenommen werden soll
				String block = """
						You can make the following calculations:

						1.   addition
						2.   subtraction
						3.   divide
						4.   modulo
						5.   pythagoras you can calculate the hypotenuse c

						To select a calculation please press the corresponding number.
						""";
				print(block);

				String inputCalcOp = scanner.nextLine();
				int calc = Integer.parseInt(inputCalcOp);

				// Fallabfrage welche Kalkulation durchgeführt werden soll
				switch (calc) {
				case 1:
					System.out.println("Your chose 'addition'");
					printUI("");
					print("Calculating: " + x + " + " + y);
					print("The solution is = " + (x + y));
					printUI("");
					break;
				case 2:
					System.out.println("You chose 'substraction'");
					printUI("");
					print("Calculating: " + x + " - " + y);
					print("The solution is = " + (x - y));
					printUI("");
					break;
				case 3:
					System.out.println("You chose 'divide'");
					printUI("");
					print("Calculating: " + x + " / " + y);
					print("The solution is = " + (x / y));
					printUI("");
					break;
				case 4:
					System.out.println("You chose 'modulo'");
					printUI("");
					print("Calculating: " + x + " % " + y);
					print("The solution is = " + (x % y));
					printUI("");
					break;
				case 5:
					System.out.println("You chose 'pythagoras you can calculate the hypotenuse c'");
					printUI("");
					print("Calculating: c = sqrt(" + x + "^2 + " + y + "^2");
					print("The solution is = " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
					printUI("");
					break;
				}

				// Abfrage ob weitergerechnet werden soll
				print("Would you like to calculate again?");
				print("Press y for yes or any other key for abort.");
				String inputWeiter = scanner.nextLine();
				printUI("");
				if (inputWeiter.equals("y")) {
					terminate = false;
					printUI("");
					print("");
					print("NEXT OPERATION");
					print("");
					printUI("");
				} else {
					terminate = true;
				}
// WENN INTEGER GERECHNET WERDEN SOLL
			} else {
				// Eingabe erste Zahl
				print("Type in the first number: ");
				String inputX = scanner.nextLine();
				int x = Integer.parseInt(inputX);
				print("x = " + x);
				printUI("");

				// Eingabe zweite Zahl
				print("Type in the second number: ");
				String inputY = scanner.nextLine();
				int y = Integer.parseInt(inputY);
				print("y = " + y);
				printUI("");

				// Abfrage welche Kalkulation vorgenommen werden soll
				String block = """
						You can make the following calculations:

						1.   addition
						2.   subtraction
						3.   divide
						4.   modulo
						5.   pythagoras you can calculate the hypotenuse c

						To select a calculation please press the corresponding number.
						""";
				print(block);

				String inputCalcOp = scanner.nextLine();
				int calc = Integer.parseInt(inputCalcOp);

				// Fallabfrage welche Kalkulation durchgeführt werden soll
				switch (calc) {
				case 1:
					System.out.println("Your chose 'addition'");
					printUI("");
					print("Calculating: " + x + " + " + y);
					print("The solution is = " + (x + y));
					printUI("");
					break;
				case 2:
					System.out.println("You chose 'substraction'");
					printUI("");
					print("Calculating: " + x + " - " + y);
					print("The solution is = " + (x - y));
					printUI("");
					break;
				case 3:
					System.out.println("You chose 'divide'");
					printUI("");
					print("Calculating: " + x + " / " + y);
					print("The solution is = " + (x / y));
					printUI("");
					break;
				case 4:
					System.out.println("You chose 'modulo'");
					printUI("");
					print("Calculating: " + x + " % " + y);
					print("The solution is = " + (x % y));
					printUI("");
					break;
				case 5:
					System.out.println("You chose 'pythagoras you can calculate the hypotenuse c'");
					printUI("");
					print("Calculating: c = sqrt(" + x + "^2 + " + y + "^2");
					print("The solution is = " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
					printUI("");
					break;
				}

				// Abfrage ob weitergerechnet werden soll
				print("Would you like to calculate again?");
				print("Press y for yes or any other key for abort.");
				String inputWeiter = scanner.nextLine();
				printUI("");
				if (inputWeiter.equals("y")) {
					terminate = false;
					printUI("");
					print("");
					print("NEXT OPERATION");
					print("");
					printUI("");
				} else {
					terminate = true;
				}
			}
		} while (!terminate);
// ABBRUCH
		printUI("");
		printUI("");
		print("");
		print("Thank you for using the calculator. See you soon!");
		print("");
		printUI("");
		printUI("");
		printUI("");
	}
}
