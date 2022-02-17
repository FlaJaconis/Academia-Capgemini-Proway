package exerc_revisao.atp23_precisa_terminar.controller;

import java.util.ArrayList;

import exerc_revisao.atp23_precisa_terminar.model.Livros;

public class ControllerLivros {

    private ArrayList<Livros> lista_livros = new ArrayList<Livros>();

    // CREATE
    public void salvar(Livros lv) {
        lista_livros.add(lv);
    }

    // READ
    public ArrayList<Livros> listar() {
        return this.lista_livros;
    }

    // UPDATE
    public void update(Livros lv) {
        for (Livros livro : lista_livros) {
            if (this.lista_livros.getId() == lv.getId()) {
                deletar(livro);
                salvar(lv);
            }
        }
    }

    // DELETE
    public void deletar(Livros lv) {
        lista_livros.remove(lv);
    }
}