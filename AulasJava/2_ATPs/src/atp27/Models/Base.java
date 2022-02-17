/* _ Crie um sistema de cadastro de Filmes e Séries.
_  O sistema deve utilizar o padrão de arquitetura MVC
_  Os modelos devem possuir um id e outros atributos públicos de sua escolha.
_  As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
_  A view deve testar as operações de CRUD para cada controller (Utilize dados fixo, sem entrada do usuário).*/


package exerc_revisao.atp27.Models;

public class Base {
    public int id;
    public String titulo;
    public String genero;


    @Override
    public String toString() {
        return "\nID: " + id + "\nTítulo: " + titulo + "\nGênero: " + genero;
    }
}