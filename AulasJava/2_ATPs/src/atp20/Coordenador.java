package exerc_revisao.atp20;

public class Coordenador extends Funcionario{
    private String cursoCoordenado;
    private double bonus;

    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
    public String getCursoCoordenado() {
        return this.cursoCoordenado;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return this.bonus;
    }
}
