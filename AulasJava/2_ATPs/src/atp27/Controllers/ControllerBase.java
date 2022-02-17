package exerc_revisao.atp27.Controllers;

import java.util.ArrayList;

//CB passa a definir a classe ControllerBase

public class ControllerBase<CB> {

    private ArrayList<CB> cadastrados;

    public ControllerBase() {
        this.cadastrados = new ArrayList<CB>();
    }

    // create
    public void adicionar(CB cadastro) {
        cadastrados.add(cadastro);
    }

    // read
    public ArrayList<CB> read() {
        return this.cadastrados;
    }

    // delete
    public void deletar(CB cadastro) {
        cadastrados.remove(cadastro);
    }

    // update
    public void atualizar(CB cadastro) {
        if (verificar(cadastro)) {
            this.deletar(cadastro);
            this.adicionar(cadastro);
        }
    }

    public boolean verificar(CB cadastro) {
        return this.cadastrados.contains(cadastro);
    }
}
