package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) {
        String[] arrays = input.split(" ");
        if(arrays.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение");
        }
        int a;
        int b;
        try { a = Integer.parseInt(arrays[0]);
            b = Integer.parseInt(arrays[2]);

    }catch (NumberFormatException number) {
            throw new IllegalArgumentException("Некорректные числа");

        }
        if(a<1 || a>=10 || b<1 || b>=10){
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
        }
        String operator = arrays[1];
        int result;
        switch (operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b==0){
                    throw new IllegalArgumentException("Деление на ноль не разрешается");
                }
                result = a / b;
                break;
            default: throw new IllegalArgumentException("Некорректная операция");}
        return String.valueOf(result);

        }
}
