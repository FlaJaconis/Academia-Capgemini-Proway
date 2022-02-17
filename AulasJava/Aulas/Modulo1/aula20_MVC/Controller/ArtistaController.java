package modulo2.aula20_MVC.Controller;

import java.util.ArrayList;

import modulo2.aula20_MVC.Model.Artista;

public class ArtistaController {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void salvar(Artista a){
        artistas.add(a);
    }

    public ArrayList<Artista> listar(){
        return artistas;
    }
}
