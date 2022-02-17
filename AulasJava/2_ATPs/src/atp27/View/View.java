package exerc_revisao.atp27.View;

import exerc_revisao.atp27.Models.Filmes;
import exerc_revisao.atp27.Models.Series;

import java.util.ArrayList;

import exerc_revisao.atp27.Controllers.ControllerBase;
import exerc_revisao.atp27.Controllers.ControllerFilmes;
import exerc_revisao.atp27.Controllers.ControllerSeries;
import exerc_revisao.atp27.Models.Base;

public class View {
    public static void main(String[] args) {

        
        ControllerBase cb = new ControllerBase();
        ControllerFilmes cf = new ControllerFilmes();
        ControllerSeries cs = new ControllerSeries();
        
        Base base = new Base();

        Filmes f1 = new Filmes();
        f1.id = 123;
        f1.titulo = "Brilho eterno de uma mente sem lembrança";
        f1.genero = "Ficção Científica/Romance";
        f1.anoLancamento = 2004;

        Filmes f2 = new Filmes();
        f2.id = 124;
        f2.titulo = "Não por acaso";
        f2.genero = "Drama";
        f2.anoLancamento = 2007;

        Series s1 = new Series();
        s1.id = 149;
        s1.titulo = "Arquivos X";
        s1.genero = "Ficção Científica/Supense";
        s1.temporada = 5;

        System.out.println("\n+----------------- Cadastro de Filmes e Séries -----------------+\n");
        cf.adicionar(f1);
        System.out.println(f1);
        System.out.printf("Filme cadastrado com sucesso!\n");

        cf.adicionar(f2);
        System.out.println(f2);
        System.out.printf("Filme cadastrado com sucesso!\n");

        cf.adicionar(s1);
        System.out.println(s1);
        System.out.printf("Série cadastrado com sucesso!\n");

        listagem(cf);
        listagem(cs);

        System.out.println("\n+---------------------------------------------------------------+\n");

    }
    
    static public void listagem(Object obj) {
        if (obj instanceof ControllerFilmes) {
            ControllerFilmes cf = (ControllerFilmes) obj;
            for (Filmes filme : cf.read()) {
                System.out.println(filme);
            }
        } else if (obj instanceof ControllerSeries) {
            ControllerSeries cs = (ControllerSeries) obj;
            for (Series serie : cs.read()) {
                System.out.println(serie);
            }
        }
    }
}
