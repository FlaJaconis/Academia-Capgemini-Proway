package modulo1.aula7;

import java.util.Scanner;

public class for3_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Os números primos de 1 a 150 são: ");
        for (int i = 2; i < 150; i++) {

            boolean primo = true;

            for (int num = 2; num < i; num++) {
                if (i % num == 0) {
                    primo = false;
                }
            }
                if (primo) {
                    System.out.println(i);
                }
            }
        }
    }


