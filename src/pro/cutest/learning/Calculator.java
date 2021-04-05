package pro.cutest.learning;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		new Calculator().calculator();
	}

	public void calculator(){
		Scanner  scanner = new Scanner(System.in);
		String command = "";
		double firstNumber = 0;
		double secondNumber = 0;
		int choice = 1;

		System.out.println("Calculator Loaded");

		while(true){
			if (command.equals("exit")){
				break;
			}
			if (choice < 4){
				if (choice == 1){
					try{
						System.out.println("Please enter your first number");
						command = scanner.nextLine();
						double number = Double.parseDouble(command);
						firstNumber = number;

						choice++;
					}catch (NumberFormatException ex){
						if (command.equals("exit")){
							System.out.println();
						}else{
							System.out.println("Put in Proper Numbers Please :)");
							System.out.println();
						}
					}
				} else if (choice == 2){
					try{
						System.out.println("Please enter your second number");
						command = scanner.nextLine();
						double number = Double.parseDouble(command);
						secondNumber = number;

						choice++;
					}catch (NumberFormatException ex){
						if (command.equals("exit")){
							System.out.println();
						}else{
							System.out.println("Put in Proper Numbers Please :)");
							System.out.println();
						}
					}
				} else if (choice == 3){
					System.out.println("Please enter your operator (+, -, *, /)");
					command = scanner.nextLine();
					if (command.equals("+")){
						System.out.println("Result: " + (firstNumber + secondNumber));
					} else if (command.equals("-")){
						System.out.println("Result: " + (firstNumber - secondNumber));
					} else if (command.equals("*")){
						System.out.println("Result: " + (firstNumber * secondNumber));
					} else if (command.equals("/")){
						System.out.println("Result: " + (firstNumber / secondNumber));
					} else {
						if (command.equals("exit")){
							System.out.println();
						}else{
							System.out.println("Invalid Operator: " + command);
							continue;
						}
					}
					System.out.println();
					choice = 1;
				}
			}

		}
		System.out.println("Thank you and Goodbye");
	}
}
//addition
//subtraction
//multiplication
//division