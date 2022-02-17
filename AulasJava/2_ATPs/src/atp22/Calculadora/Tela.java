package exerc_revisao.atp22.Calculadora;

public class Tela {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        
        int res1 = calc.Soma(10, 50);
        System.out.println(res1);
        
        double res2 = calc.Soma(10.0, 50.0);
        System.out.println(res2);
        
        float res3 = calc.Soma(10.0f, 50.0f, 20.0f);
        System.out.println(res3);
        
        long res4 =calc.Soma(10L, 50L, 20L);
        System.out.println(res4);
        
    }
}
