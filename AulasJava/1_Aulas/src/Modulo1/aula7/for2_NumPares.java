package modulo1.aula7;

import java.util.Scanner;

public class for2_NumPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Os números pares de 0 a 100 são: ");

        for (int cont = 0; cont < 100; cont++) {
            if (cont % 2 == 0) {
                System.out.printf(" %d\n", cont);
            }
        }
    }
}




