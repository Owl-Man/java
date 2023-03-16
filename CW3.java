import java.util.Scanner;

public class CW3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a_2 = scanner.nextInt();
        int b = scanner.nextInt();
        int n_2 = 1001;

        int[] c = new int[n_2];


        for (int i = 0; i < n_2; i++) {
            c[i] = (int) Math.pow(i, 3);
        }

        System.out.println(c[a_2] + "\n" + c[b]);


        //1 task
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        for (int j = 0; j < n; j++) {
            System.out.println(a[j] * x);
        }
    }
}
