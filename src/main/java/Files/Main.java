package Files;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner brugerInput = new Scanner(System.in);

        System.out.print("skriv første tal: ");
        double førsteVærdi = brugerInput.nextDouble();

        System.out.print("skriv andet tal: ");
        double andenVærdi = brugerInput.nextDouble();

        System.out.println("Vælg operator");

        switch (brugerInput.next()) {
            case "+":
                System.out.println(calculator.add(førsteVærdi, andenVærdi));
                break;
            case "-":
                System.out.println(calculator.subtract(førsteVærdi, andenVærdi));
                break;
            case "*":
                System.out.println(calculator.multiply(førsteVærdi, andenVærdi));
                break;
            case "/":
                System.out.println(calculator.divide(førsteVærdi, andenVærdi));
                break;
        }


    }
}
