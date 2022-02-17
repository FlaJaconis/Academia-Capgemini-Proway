package exerc_revisao.atp26;
//_  Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade .
//_  Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso .
//_  Crie uma sobrescrita do método equals nas duas classes para comparar os dados especificos de cada uma.
//_  Crie uma sobrescrita do método toString nas duas classes para imprimir todos os dados.
//_  Crie uma classe Dados com um atributo privado do tipo array de Object.
//_  Crie uma inicialização do array para 5 posições dentro do do método construtor da classe.
//_  Crie um método para adicionar elementos ao array e que permita receber tanto objetos da classe pessoa quanto objetos da classe Aluno. Caso o array já tenha todas as posições ocupadas, deve ser adicionado mais 5 posições ao array.
//_  Crie um método para mostrar quantos elementos já foram adicionados ao array.
//_  Crie um método para remover um elemento do array.
//_  Crie um método para verificar se um determinado objeto já foi salvo no array.
//_  Crie uma classe Main com um método main, neste método, crie um objeto da classe Pessoa, um da classe Aluno e atribua valores para as propriedade de cada objeto.
//_  Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
//_  Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
//_  Verifique se o segundo objeto de pessoa já está salvo no array,utilizando o método da classe Dados.
//_  Remova o aluno do array, utilizando o método da classe Dados.

public class Dados {
    private Object[] listaObj;
    int posAtual;
    int tamAtual = 5;

    public Dados() {
        this.listaObj = new Object[5];
    }

    public String adiciona(Object obj) {
        String mensagem;
        if (posAtual < listaObj.length) {
            listaObj[posAtual] = obj;
            posAtual++;
        } else {
            tamAtual = tamAtual + 5;
            Object[] listaObj2 = new Object[tamAtual];
            for (int cont = 0; cont < listaObj.length; cont++) {
                listaObj2[cont] = listaObj[cont];
            }
            listaObj = listaObj2;
        }
        mensagem = "Cadastrado com sucesso!";
        return mensagem;
    }

    public int qtdeElementos() {
        return posAtual + 1;
    }

    public String remover(Object obj) {
        for (int cont = 0; cont < listaObj.length; cont++) {
            if (listaObj[cont].equals(obj)) {
                organizar(cont);
                posAtual --;
                return "Cadastro removido com sucesso!";
            }
        }
        return "Cadastro não encontrado!";
    }
    public void organizar(int posicao){
        for (int cont = posicao; cont < listaObj.length -1; cont++){
            this.listaObj[cont] = this.listaObj[cont+1];
        }
    }
    public boolean verificar(Object obj){
        for (int cont = 0; cont < posAtual; cont++){
            if(listaObj[cont].equals(obj)){
                return true;
            }
        }
        return false;
    }
}
