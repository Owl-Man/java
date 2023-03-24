package ClassLabWork2;
import java.util.Scanner;

public class MinDivider {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), divider = 2;

        while (number >= divider) {
            if (number % divider == 0) {
                System.out.println(divider);
                break;
            }

            divider++;
        }
    }
}
