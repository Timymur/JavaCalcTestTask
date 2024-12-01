import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (пример 2 + 3): ");
        String input = scanner.nextLine();
        String answer = calc(input);
        System.out.println(answer);
    }


    public static String calc(String input) {

        String[] mass = input.split(" ");
        if (mass.length != 3) return "Неверная запись";

        try {

            int x = Integer.parseInt(mass[0]);
            int y = Integer.parseInt(mass[2]);
            int answer;

            if (    x > 10 || x < 1 ||
                    y > 10 || y < 1)
                return "Значения не входят в рабочий диапазон от 1 до 10";

            switch (mass[1]) {
                case ("+"):
                    answer = x + y;
                    break;
                case ("-"):
                    answer = x - y;
                    break;
                case ("*"):
                    answer = x * y;
                    break;
                case ("/"):
                    answer = x / y;
                    break;
                default:
                    return "Калькулятор не знает такой операции";
            }

            return Integer.toString(answer);
        }

        catch (NumberFormatException e) {
            return "Ошибка: введите корректные числа";
        }

        catch (Exception e) {
            return "Произошла ошибка: " + e.getMessage();
        }
    }
}