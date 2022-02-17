package exerc_revisao.atp28.controllers;

import java.util.ArrayList;

public class BaseController<BP> {

    private ArrayList<BP> base;

    // Contrutor
    public BaseController() {
       base = new ArrayList<BP>();
    }

    // CRUD
    // Create
    public void create(BP pessoa) {
        base.add(pessoa);
    }

    // Read
    public ArrayList<BP> read() {
        return this.base;
    }

    // Update
    public void update(BP pessoa) {
        if (verificar(pessoa)) {
        }
    }

    // Delete
    public void delete(BP pessoa) {
        base.remove(pessoa);
    }

    public boolean verificar(BP pessoa) {
        return this.base.contains(pessoa);
    }
}
