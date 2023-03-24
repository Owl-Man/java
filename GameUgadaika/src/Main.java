import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1);
        System.out.println(number);

        while (true) {
            int guess = 0;
            System.out.println("Введите число от 0 до 100");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Угадали");

                System.out.println("Хотите сыграть еще?");
                String answer = scanner.next();

                if (Objects.equals(answer, "Да")) {
                    number = (int) (Math.random() * 100 + 1);
                } else break;
            }
            else {
                if (guess > number) System.out.println("Ваше число больше");
                else System.out.println("Ваше число меньше");
            }
        }
    }
}