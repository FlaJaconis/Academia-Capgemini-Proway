package exerc_revisao.atp18;

public class TelaLoja {
    public static void main(String[] args) {
        Produto pdt1 = new Produto();
        
        pdt1.setCodigo(01);
        int cod = pdt1.getCodigo();
        System.out.printf("O código do produto é: %d \n", cod);
        
        pdt1.setNome("mouse óptico");
        String nome = pdt1.getNome();
        System.out.printf("O nome do produto é: %s \n", nome);

        pdt1.setDescricao("mouse óptico sem fio");
        String desc = pdt1.getDescricao();
        System.out.printf("A descrição do produto é: %s \n", desc);

        pdt1.setValor(45);
        double valor = pdt1.getValor();
        System.out.printf("O valot do produto é: %.2f \n", valor);
    }
    
}
