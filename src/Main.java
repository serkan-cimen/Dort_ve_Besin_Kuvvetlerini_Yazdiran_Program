import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        int i = 1;
        int kuvvet4 = 1;
        int kuvvet5 = 1;

        while (i <= number) {
            kuvvet4 *= 4;
            kuvvet5 *= 5;

            System.out.println("4'ün kuvveti : " + kuvvet4);
            System.out.println("5'in kuvveti : " + kuvvet5);

            i++;
        }
    }
}