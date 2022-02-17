package atp29_dupla.controllers;

import java.util.ArrayList;

public class BaseController<T> {
    ArrayList<T> lista;

    public BaseController() {
        lista = new ArrayList<T>();
    }

    // create

    public void create(T produto) {
        lista.add(produto);
    }

    // read - lembrar de conferir se funcionou sem <T>

    public ArrayList read() {
        return this.lista;
    }

    // update

    public void update(T produto) {
        if (lista.contains(produto)) {
            delete(produto);
            create(produto);
        }
    }

    // delete
    public void delete(T produto) {
        lista.remove(produto);
    }

    public void listar(ArrayList<T> lista){
        for (T t : lista) {
            System.out.println(t);
        }

    }
}
