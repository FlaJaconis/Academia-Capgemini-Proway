package modulo2.aula12_Get_e_Set;

public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Flávia");
        System.out.println(p1.getNome());

        //pode ser dessa forma
        p1.setSobrenome("Nunes Jaconis");
        String s = p1.getSobrenome();
        System.out.println(s);

        p1.setIdade(40);
        int i = p1.getIdade();
        System.out.println(i);

        p1.setCPF("000.000.000-00");
        System.out.println(p1.getCPF());
    }
}
