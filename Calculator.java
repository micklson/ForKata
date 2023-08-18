import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате '1 + 2':");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) {
        String[] tokens = input.split(" ");

        if (tokens.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        try {
            int num1 = Integer.parseInt(tokens[0]);
            int num2 = Integer.parseInt(tokens[2]);

            if (tokens.length != 3 || num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                throw new IllegalArgumentException("Некорректное выражение или числа должны быть от 1 до 10");
            }

            String operator = tokens[1];
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введенные значения должны быть целыми числами");
        }

        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[2]);
        String operator = tokens[1];

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                return "Некорректный оператор";
        }

        return String.valueOf(result);
    }
}