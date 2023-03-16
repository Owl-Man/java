package HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 6 (по порядку 1-ая)
        System.out.println("Задача 6, введите числа и в конце 0: ");

        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number != 0) sum += number;
            else break;
        }

        System.out.println(sum);

        //Задача 7 (по порядку 2-ая)
        System.out.println("Задача 7, введите числа n и x: ");

        int n = scanner.nextInt(), x = scanner.nextInt();
        int res = 0;

        while (res < n) {
            res += x;
        }

        System.out.println(res);

        //Задача 8 (по порядку 3-я)
        int n_8 = scanner.nextInt();
        int count = 0, proiz = 1;

        while (proiz < n_8) {
            int num = scanner.nextInt();
            count++;
            proiz *= num;
        }

        System.out.println("Количество введенных чисел: " + count);
        System.out.println("Произведение чисел: " + proiz);

        //Задача 9 (по порядку 4-ая)
        int n_9 = scanner.nextInt();
        String star = "*";
        int i9 = 1;

        while (i9 <= n_9) {
            System.out.println(star);
            i9++;
            star += "*";
        }

        /*int n_9 = scanner.nextInt();

        for (int i = 1; i <= n_9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/

        //Задача 10 (по порядку 5-ая)
        int i_10 = 1;
        int n_10 = scanner.nextInt();
        String star_10 = "*";
        int star2 = 1;

        while (i_10 <= n_10) {
            System.out.println(" ".repeat(n_10 - i_10) + star_10.repeat(star2));
            i_10++;
            star2 += 2;
        }

        /*int n_10 = scanner.nextInt();

        for (int i = 1; i <= n_10; i++) {
            for (int j = 1; j <= n_10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }*/
    }
}
