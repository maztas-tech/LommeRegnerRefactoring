package Files.opgave1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner brugerInput = new Scanner(System.in);
        /*
        Bruger input for første og anden værdier
         */

        System.out.print("Skriv første tal: ");
        double førsteVærdi = brugerInput.nextDouble();

        System.out.print("Skriv andet tal: ");
        double andenVærdi = brugerInput.nextDouble();

        /*
        Denne switch tager i mod hvilken operand der skal benyttes
        hvor den derefter printer værdierne ud.
         */
        System.out.println("Vælg operator");

        switch (brugerInput.next()) {
            case "+":
                out(calculator.add(førsteVærdi, andenVærdi));
                break;
            case "-":
                out(calculator.subtract(førsteVærdi, andenVærdi));
                break;
            case "*":
                out(calculator.multiply(førsteVærdi, andenVærdi));
                break;
            case "/":
                out(calculator.divide(førsteVærdi, andenVærdi));
                break;
        }
    }

    private static void out(Object input){
        System.out.println(input);
    }
}
