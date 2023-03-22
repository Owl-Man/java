package HomeWork;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 1 (произведение чисел)
        System.out.println("Задача 1 (произведение чисел)");

        int number = scanner.nextInt();
        int proiz = 1;

        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10;
            proiz *= digit;
        }

        System.out.println(proiz);

        //Задача 2 (сколько элементов, равных максимуму?)
        System.out.println("Задача 2 (сколько элементов, равных максимуму?)");

        int count = 0;
        int max_num = -10^10;

        for (int num = 1; num != 0; num = scanner.nextInt()) {
            if (max_num == num) count++;
            max_num = Math.max(max_num, num);
        }

        System.out.println(count);

        //Задача 3 (средний возраст)
        System.out.println("Задача 3 (средний возраст)");

        System.out.print("Введите количество учащихся: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя ученика " + (i + 1) + ": ");
            scanner.next();

            System.out.print("Введите возраст ученика " + (i + 1) + ": ");
            sum += scanner.nextInt();
        }

        float average = (float) sum / n;
        System.out.println(average);

        //Задача 4 (потерянная карточка)
        System.out.println("Задача 4 (потерянная карточка)");

        System.out.print("Введите количество карточек: ");
        int N = scanner.nextInt(), originalSum = 0, sumAfterMissing = 0;

        for (int i = 1; i <= N; i++) {
            originalSum += i;
        }

        for (int i = 1; i < N; i++) {
            int cardNumber = scanner.nextInt();
            sumAfterMissing += cardNumber;
        }

        System.out.println("Номер потерянной карточки: " + (originalSum - sumAfterMissing));
    }
}
