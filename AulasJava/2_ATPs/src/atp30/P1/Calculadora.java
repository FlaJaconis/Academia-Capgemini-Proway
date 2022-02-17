package exerc_revisao.atp30.P1;

public class Calculadora {
    public int soma;
    public int subtracao;
    public int multiplicacao;
    public int divisao;
   
    public int Somar (int num1, int num2){
        this.soma = num1 + num2;
        return soma;
    }

    public int Subtrair (int num1, int num2){
         this.subtracao = num1 - num2;
        return subtracao;
    }

    public int Multiplicar (int num1, int num2){
        this.multiplicacao = num1 * num2;
        return multiplicacao;
    }

    public double Dividir (int num1, int num2){
        this.divisao = num1 / num2;
        return divisao;
    }
}
   
