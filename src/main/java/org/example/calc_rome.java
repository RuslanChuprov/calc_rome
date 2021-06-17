package org.example;

import java.util.Scanner;

public class calc_rome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = getFloat();
        float num2 = getFloat();
        char operation = getOperation();
        float result = calc(num1, num2, operation);
        System.out.println("Result operation = " + result);
    }


    public static float getFloat() {
        System.out.println("Input number:");
                    float num;
            if (scanner.hasNextFloat()) {
                num = scanner.nextFloat();
            } else {
                System.out.println("Error: Incorrect number input");
                scanner.next();
                num = getFloat();
            }
            return num;
        }

    public static char getOperation() {
        System.out.println("Input operation:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Wrong type of operation");
            scanner.next();//рекурсия
            operation = getOperation();
        }

        return operation;
    }

    public static float calc(float num1, float num2, char operation){
        float result = 1;
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
        }
        return result;
    }
}
