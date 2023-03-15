package LabWork2;
import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int y = sc.nextInt();

        int dayCount = 1;

        while (x < y) {
            x *= 1.1;
            dayCount++;
        }

        System.out.println(dayCount);
    }
}
