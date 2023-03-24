package ClassLabWork2;
import java.util.Scanner;

public class Arifmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод чисел с клавиатуры
        int number;
        float count = 0, sum = 0;

        while (true) {
            number = sc.nextInt();
            if (number != 0) {
                sum += number;
                count++;
            }
            else break;
        }

        System.out.println(sum / count);
    }
}
