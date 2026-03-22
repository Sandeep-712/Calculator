package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputReader input = new InputReader(scanner);
        Calculator calc = new Calculator();
        OutputWriter output = new OutputWriter();

        try {
            double a = input.readNumbers("Enter first numbers ");
            String op = input.readOperator("Enter operator (+,-,*,/): ");
            double b = input.readNumbers("Enter second number: ");

            //Compute
            double result = compute(calc, a, op, b);

            output.printResult(a,op,b,result);
        }catch (Exception e){
            output.printError(e.getMessage());
            System.exit(1);
        }finally {
            scanner.close();
        }
    }

    private static double compute(Calculator calc, double a,String op,double b){
        return switch (op) {
            case "+" -> calc.add(a, b);
            case "-" -> calc.subtract(a, b);
            case "*" -> calc.multiply(a, b);
            case "/" -> calc.divide(a, b);
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        };
    }
}


