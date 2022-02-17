package exerc_revisao.atp15_2;

public class Principal{
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        int som = calc.somar(10, 15);
        int sub = calc.subtrair(10, 15);
        int mullt = calc.multiplicar(10, 15);
        int div = calc.divisao(20, 5);
        
        System.out.printf("Soma: %d, Subtrair: %d, Multiplicação: %d, Divisão: %d,", som, sub, mullt, div);

    }
}