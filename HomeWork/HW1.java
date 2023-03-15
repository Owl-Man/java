package HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 1
        System.out.println("Задача 1, введите количество пирожков: ");

        int pirojki_count = scanner.nextInt();

        System.out.println(pirojki_count / 2);

        //Задача 2
        System.out.println("Задача 2, введите h, m и x: ");
        int h = scanner.nextInt(), m = scanner.nextInt(), x = scanner.nextInt();
        int timeInSeconds = ((h * 60) + m) * 60;

        if (timeInSeconds >= x) System.out.println("Успел");
        else System.out.println("Опоздал");

        //Задача 3
        System.out.println("Задача 3, введите 3 числа: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();

        System.out.println(Math.max(Math.max(num1, num2), num3));

        //Задача 4
        System.out.println("Задача 4, введите год: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) System.out.println("Yes");
        else System.out.println("No");

        //Задача 5
        System.out.println("Задача 5, введите a, b: ");
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a != 0) System.out.println("1");
        else System.out.println("0");

        //Задача 6
        System.out.println("Задача 6, введите a, b, с: ");
        int a6 = scanner.nextInt(), b6 = scanner.nextInt(), c6 = scanner.nextInt();

        float D = b6*b6 - 4 * a6 * c6;

        if (D > 0) System.out.println("2");
        else if (D == 0) System.out.println("1");
        else System.out.println("0");

        //Задача 7
        System.out.println("Задача 7, введите a, b, с: ");
        int side1 = scanner.nextInt(), side2 = scanner.nextInt(), side3 = scanner.nextInt();

        int minSide = Math.min(Math.min(side1, side2), side3);
        int maxSide = Math.max(Math.max(side1, side2), side3);
        int averageSide = (side1 + side2 + side3) - maxSide - minSide;

        if (minSide + averageSide > maxSide) System.out.println("Yes");
        else System.out.println("No");

        //Задача 8
        System.out.println("Задача 8, введите координаты слона и другой фигуры: ");
        int slonX = scanner.nextInt(), slonY = scanner.nextInt(), enemyX = scanner.nextInt(), enemyY = scanner.nextInt();

        if ((enemyX == slonX - 2 && enemyY == slonY - 2) ||
                (enemyX == slonX + 2 && enemyY == slonY + 2) ||
                (enemyX == slonX - 2 && enemyY == slonY + 2) ||
                (enemyX == slonX + 2 && enemyY == slonY - 2)) System.out.println("Yes");
        else System.out.println("No");

        //Задача 9
        System.out.println("Задача 9, введите k, m и n: ");
        int k = scanner.nextInt(), minutes = scanner.nextInt(), n = scanner.nextInt();
        int totalTime = 0;

        while (n > 0)
        {
            if (n - k > 0) totalTime += (minutes * 2) / k;
            else totalTime += minutes * 2;

            n -= k;
        }

        System.out.println(totalTime);

        //Задача 10
        System.out.println("Задача 10, введите число: ");
        int arabicNumber = scanner.nextInt();

        int []A = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String []R = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String romanNumber = "";
        int useCount;

        for (int i = 0; i < A.length; i++)
        {
            useCount = arabicNumber / A[i];

            for (int j = 0; j < useCount; j++)
            {
                romanNumber += R[i];
            }

            arabicNumber -= useCount * A[i];
        }

        System.out.println(romanNumber);
    }
}