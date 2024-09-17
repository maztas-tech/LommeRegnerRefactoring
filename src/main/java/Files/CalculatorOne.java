package Files;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorOne {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        // "char" kan bruges ligesom string og int. Det må dog kun være et tegn.

        double userNumber1;
        double userNumber2;
        char userInput;
        double result;
        boolean runCalculator = true;

        while (runCalculator){
            try {
                System.out.println("""
                    
                    Velkommen til regnemaskinen
                    + for addition 
                    - for substraktion 
                    * for multiplikation 
                    / for division 
                    q for quit
                    """);

                userInput = input.next().charAt(0);
                if (Character.isDigit(userInput)){
                    throw new InputMismatchException();
                }

                if (userInput == 'q'){
                    runCalculator = false;
                }

                userNumber1 = inputDouble("Write first number : ");



                userNumber2 = inputDouble("Write second number : ");

                switch (userInput){
                    case '+':
                        result = userNumber1 + userNumber2;
                        break;
                    case '-':
                        result = userNumber1 - userNumber2;
                        break;
                    case '*':
                        result = userNumber1 * userNumber2;
                        break;
                    case '/':
                        result = userNumber1 / userNumber2;
                        break;
                    default:
                        continue;
                }

                System.out.print("RESULT = " + result + "\n");

            }catch (InputMismatchException e){
                System.out.print("Ugyldig oprator (regne tegn)");
            }
        }
    }
    
    private static double inputDouble(String userPrompt) {
        boolean ok = false;
        double number = 0;

        do {
            try {
                System.out.print(userPrompt);
                number = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
            }
        } while (!ok);
        return number;
    }
}
