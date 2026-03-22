package org.example;
import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader(Scanner scanner){
        this.scanner=scanner;
    }

    public double readNumbers(String prompt){
        System.out.print(prompt);

        try{
            double value=scanner.nextDouble();
            scanner.nextLine();
            return value;
        }catch(java.util.InputMismatchException e){
            scanner.nextLine();
            throw new IllegalArgumentException("Invalid number format",e);
        }
    }

    public String readOperator(String prompt){
        System.out.print(prompt);

        String op=scanner.nextLine().trim();

        if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")){
            return op;
        }

        throw new IllegalArgumentException("Unknown operator: "+ op +".Use +,-,*,/");
    }
}
