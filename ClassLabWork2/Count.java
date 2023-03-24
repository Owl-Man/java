package ClassLabWork2;
import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int countNumbers = 0;

        while (a <= b){
            if (a % 3 == 0 && a % 5 != 0) countNumbers++;
            a++;
        }

        System.out.println(countNumbers);
    }
}
