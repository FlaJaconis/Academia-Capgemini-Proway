package exerc_revisao;
import java.util.Scanner;
public class atp13 {
    
    private static Scanner sc;


    public static void main(String[] args) {

        int num1, num2, num3, num4, res1, res2, res3, res4;
        double respostaMedia;

        //chamando cabeçalho
        cabecalho();

        //chamando entrada dos números pelo usuário
        num1 = ler_numero("Digite o primeiro número: ");
        num2 = ler_numero("Digite o segundo número: ");
        num3 = ler_numero("Digite o terceiro número: ");
        num4 = ler_numero("Digite o quarto número: ");
        
        //executando soma a partir do método somar()
        res1 = somar(num1, num2);
        res2 = somar(res1, num3);
        res3 = somar(res2, num1);
        res4 = somar(res3, num4);
        
        //executando cálculo da média a partir do método média()
        respostaMedia = media(num1, num2, num3, num4);

        //imprimindo resultados        
        System.out.printf("\nResultado soma1: %d  ", res1);
        System.out.printf("\nResultado soma2: %d  ", res2);
        System.out.printf("\nResultado soma3: %d  ", res3);
        System.out.printf("\nResultado soma4: %d  ", res4);

        System.out.printf("\nResultado média: %.2f ", respostaMedia);
    }

    // método ler entradas dos números
    static int ler_numero(String mensagem){
        sc = new Scanner (System.in);
        System.out.println(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    
    // método ler cabeçalho
    static void cabecalho(){
        System.out.println("\n================== CÁLCULO DE MÉDIA ================== ");
    }

    // método para realizar soma
    static int somar( int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }

    // método para realizar cálculo da média
    static double media ( int numero1, int numero2, int numero3, int numero4) {
        double soma =  numero1 + numero2 + numero3 + numero4;
        double resultado =  soma / 4;
        return resultado;
    }
}
