package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first number to perform operations on: ");
        double operand1 = Double.parseDouble(input.nextLine());

        System.out.println("Please input your second number: ");
        double operand2 = Double.parseDouble(input.nextLine());



        double sum = sum(operand1, operand2);
        double difference = difference(operand1, operand2);
        double division = division(operand1, operand2);
        double multiplication = multiplication(operand1, operand2);
        double remainder = remainder(operand1, operand2);

        showResults(sum, difference, division, multiplication, remainder);

    }
        public static double sum(double operand1, double operand2) {
        return operand1 + operand2;
        }

        public static double difference(double operand1, double operand2) {
        return operand1 - operand2;
        }
        public static double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
        }
        public static double division(double operand1, double operand2) {
        return operand1 / operand2;
        }
        public static double remainder(double operand1, double operand2) {
        return operand1 % operand2;
        }

    public static void showResults(double sum, double difference, double multiplication, double division, double remainder){
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + multiplication);
        System.out.println("When divided, the result is: " + division);
        System.out.println("When divided, the remainder is: " + remainder);
    }

}
