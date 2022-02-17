package modulo1.aula7;

public class for_investimento {
    public static void main(String[] args) {
        double invest1 = 5000;
        double invest2 = invest1;

        System.out.printf("Os retornos do investimento de R$ %.2f serão: ",invest1);

        for (int cont = 1; cont <= 24; cont++) {
            invest2 = (invest1 * 0.02) + invest2;
            System.out.printf("\n Mês %d - R$ %.2f", cont, invest2);
        }
    }
}
