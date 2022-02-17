package modulo1.aula2;

public class a2_5_float {
    public static void main (String args[]){
        float menor_valor = Float.MIN_VALUE;
        float maior_valor = Float.MAX_VALUE;

        System.out.println(menor_valor);
        System.out.println(maior_valor);

        //tem que usar o f no final porque, por padrão, números decimais são entendidos como double
        float salario = 800.00f;
        System.out.println(salario);

        float massa = 5.972E24f; //massa da Terra - elevado a 24
        System.out.println(massa);

    }
}
